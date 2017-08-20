(ns clojure-quotes.core
  (:require [clojure.spec.alpha :as s]
            [hiccup.core :as h]
            [clojure.xml :as xml]
            [clojure.edn :as edn]))


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

(defn to-html [m]
  [:body [:div (for [[name quotes] m]
                 (let [quotee (or name "Unknown")]
                   [:div [:h2 quotee]
                    [:ul (for [{text ::text {url ::url time ::time} ::reference} quotes]
                           [:li (format "\"%s\" - %s" text quotee)
                            (when url [:br
                                       [:a {:href url} url]
                                       (when time (format  " (%s)" time))])])]]))]])

(defn generate-html [coll]
  (->> coll
       (group-by ::quotee)
       to-html
       h/html))

(defn generate [quotes]
  (->> (conform! ::quotes quotes)
       generate-html
       (spit "generated.html")))

(generate (read-quotes))
