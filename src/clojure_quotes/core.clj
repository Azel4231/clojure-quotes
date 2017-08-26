(ns clojure-quotes.core
  (:require [clojure.spec.alpha :as s]
            [hiccup.core :as h]
            [clojure.xml :as xml]
            [clojure.edn :as edn]
            [clojure.set :refer [rename-keys]]))


(s/def ::quotes (s/coll-of ::quote))
(s/def ::quote (s/keys :req [::text]
                       :opt [::quotee ::reference ::long-text ::tags]))
(s/def ::text string?)
(s/def ::long-text string?)
(s/def ::quotee string?)
(s/def ::reference (s/keys :req [::url] :opt [::time]))
(s/def ::url string?)
(s/def ::time string?)
(s/def ::tags (s/coll-of keyword?))


(defn read-quotes []
  (->> (slurp "quotes.edn")
       edn/read-string))

(defn conform! [spec data]
  (let [conformed (s/conform spec data)]
    (if (= conformed :clojure.spec.alpha/invalid)
      (throw (RuntimeException. (s/explain-str spec data)))
      conformed)))

(defn to-hiccup [m]
  [:body [:div (for [[quotee quotes] m]
                 [:div [:h2 quotee]
                  [:ul (for [{text ::text {url ::url time ::time} ::reference} quotes]
                         [:li (format "\"%s\" - %s" text quotee)
                          (when url [:br
                                     [:a {:href url} url]
                                     (when time (format  " (%s)" time))])])]])]])

(defn html [m]
  (->> m
       to-hiccup
       h/html))

(comment "The solution would be simpler if I had generated markdown from hiccup data structures. Was too lazy though. Maybe some other time.")
(defn markdown [m]
  (apply str (for [[quotee quotes] m]
               (str "\n\n ## " quotee "\n"
                    (apply str (for [{text ::text {url ::url time ::time} ::reference} quotes]
                                 (str (format "\n- \"%s\" - %s" text quotee)
                                      (when url (str (format  "\n[%s](%s)" url url)
                                                     (when time (format " (%s)\n" time)))))))))))

(defn lastname [name]
  (last (clojure.string/split name #" ")))

(defn process-quotes [quotes]
  (->> quotes
       (group-by ::quotee)
       (#(clojure.set/rename-keys % {nil "Unknown"}))
       (sort-by (comp lastname key))))

(defn generate [gen-f quotes]
  (->> (conform! ::quotes quotes)
       process-quotes
       gen-f))

(defn -main []
  #_(->> (read-quotes)
         (generate html)
         (spit "generated.html"))
  (->> (read-quotes)
       (generate markdown)
       (spit "generated.md")))

