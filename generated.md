

 ## Arne Brasseur

- "Clojure Spec is one of the most exciting things to happen in Clojure land, and probably programming in general, in a while." - Arne Brasseur
[https://youtu.be/-MeOPF94LhI?t=23](https://youtu.be/-MeOPF94LhI?t=23)

 ## Falko Riemenschneider

- "In a Clojure world external DSL tools, or specialized code generators will not have any future. They seem just like incidental complexity, required to make working with a broken language bearable. I know, most of us do not earn their money in the Clojure world. That makes these external meta tools valuable. But not desirable. " - Falko Riemenschneider
[http://www.falkoriemenschneider.de/a__2013-07-04__Clojure-vs-MDSD.html](http://www.falkoriemenschneider.de/a__2013-07-04__Clojure-vs-MDSD.html)

 ## Rich Hickey

- "Multiple taxonomies in a single program. That's easy in Clojure." - Rich Hickey
[https://youtu.be/dGVqrGmwOAw?t=1110](https://youtu.be/dGVqrGmwOAw?t=1110)
- "Design is to take things apart in such a way that they can be put back together" - Rich Hickey
- "Design is separating into things that can be composed." - Rich Hickey
- "Every time I encounter something I can boil it down to that. Every time I encounter something that I wish my design was better, I need to do more of this [take things apart]. Over and over again. I did not take it apart enough." - Rich Hickey
- "Design helps extension. To the extent that you have broken things into separate parts, with an eye towards connecting them back together, it means that your resulting design is gonna have connection points. And when you want your system to do something new, it will be possible to do it, because there's something there. That's why design is not just about accreting up to an answer. Because when you do that you don't end up with any connecting points. And you don't end up with any building blocks. And you can't really extend that thing. 
Similarly the flipside of that is: to the extent you have broken up your problem into reusable parts and composed them, those parts may be sparable from your design and useful in another context. And that's how we get reuse. Reuse comes from design, it doesn't come from language constructs or anything like that." - Rich Hickey
[https://www.infoq.com/presentations/Design-Composition-Performance](https://www.infoq.com/presentations/Design-Composition-Performance) (11:35)

- "It's something we don't think about often enough. In our programming designs and in our systems, about the actual costs of specificity. We love specificity. When we use Java every new idea gets a new class. What does that cause to happen? You get this explosion of code! Objects were supposed to support reuse, they have done the exact opposite thing. Especially in typed languages. You get very little reuse, because you make a new thing every time. " - Rich Hickey
[https://youtu.be/-6BsiVyC1kM?t=822](https://youtu.be/-6BsiVyC1kM?t=822)
- "As a default architecture mutable objects are terrible." - Rich Hickey
[https://youtu.be/dGVqrGmwOAw?t=1535](https://youtu.be/dGVqrGmwOAw?t=1535)
- "When you know your data can never change out from underneath you, everything is different." - Rich Hickey
[https://youtu.be/dGVqrGmwOAw?t=9030](https://youtu.be/dGVqrGmwOAw?t=9030)
- "Simplicity is hard work. But in the long haul the person with a simpler system is gonna wipe the plate with you. Because they can change things when you are struggling to push elephants around" - Rich Hickey
[https://youtu.be/rI8tNMsozo0?t=1388](https://youtu.be/rI8tNMsozo0?t=1388)
- "I saw someone that was advocating that people should design their systems as systems of systems right from the get-go. Like: 'make it into six services in the first iteration'. And I said to that person: 'Wow, that seems like a lot of forethought! Why can't people morph from one system to a system of systems?'. And he said: 'You know, because of their languages and how they use them'." - Rich Hickey
[https://www.youtube.com/watch?feature=player_detailpage&v=rI8tNMsozo0#t=1913](https://www.youtube.com/watch?feature=player_detailpage&v=rI8tNMsozo0#t=1913)
- "We can make the same software we're making today with dramatically simpler stuff." - Rich Hickey
[https://youtu.be/rI8tNMsozo0?t=1163](https://youtu.be/rI8tNMsozo0?t=1163)
- "If you want everything to be familiar, you'll never learn anything new" - Rich Hickey
[https://youtu.be/rI8tNMsozo0?t=1088](https://youtu.be/rI8tNMsozo0?t=1088)
- "Simplicity enables change. I think it is the primary source of real agility. Agility means to do something. It doesn't mean to do it over." - Rich Hickey
[https://youtu.be/rI8tNMsozo0?t=2115](https://youtu.be/rI8tNMsozo0?t=2115)
- "If you've got the complexity elephant over there, you are applying the process to pushing elephants. And how good can you get at it?" - Rich Hickey
[https://youtu.be/rI8tNMsozo0?t=609](https://youtu.be/rI8tNMsozo0?t=609)
- "When later in my career I learned lisp, I saw people building very interesting systems out of much, much simpler stuff." - Rich Hickey
[https://youtu.be/VSdnJDO-xdg?t=1340](https://youtu.be/VSdnJDO-xdg?t=1340)
- "And I said... Well I can't repeat it, but I was very unhappy. Basically something to the effect of 'I have been wasting my time and my career, doing what I've been doing. And need to do something, I need to change what I'm doing. Because I'm wasting my time, I'm wasting my life doing it this way.'" - Rich Hickey
[https://youtu.be/VSdnJDO-xdg?t=1353](https://youtu.be/VSdnJDO-xdg?t=1353)
- "Easiness will eventually slow you down" - Rich Hickey
[https://www.infoq.com/presentations/Simple-Made-Easy](https://www.infoq.com/presentations/Simple-Made-Easy) (17:15)

- "This is the 'Information non-problem': Information is simple. This is a problem we create for ourselves. Because we ruin it by wrapping it in classes." - Rich Hickey
- "Encapsulation is for implementation details, but information doesn't have implementation!" - Rich Hickey
- "In OO, our fundamental construct, the Object conflates two things. Process, for which objects are an ok approach, and information for which they are a terrible, terrible, terrible approach." - Rich Hickey
[https://www.youtube.com/watch?v=VSdnJDO-xdg&feature=youtu.be&t=925](https://www.youtube.com/watch?v=VSdnJDO-xdg&feature=youtu.be&t=925)
- "There's a tiny little benefit: dot works in you IDE. Woohoo! Oh my goodness, cause I could never remember that [specific class API]. Something better happen when I press dot, because I'm doomed otherwise." - Rich Hickey
[https://youtu.be/VSdnJDO-xdg?t=3129](https://youtu.be/VSdnJDO-xdg?t=3129)
- "Programs are increasingly about code, and decreasingly about data. And I think that is a mistake." - Rich Hickey
[https://youtu.be/VSdnJDO-xdg?t=955](https://youtu.be/VSdnJDO-xdg?t=955)
- "Information is simple. The only thing you can do with information is ruin it" - Rich Hickey
[https://www.infoq.com/presentations/Simple-Made-Easy](https://www.infoq.com/presentations/Simple-Made-Easy) (56:09)

- "leave data alone" - Rich Hickey
[https://www.infoq.com/presentations/Simple-Made-Easy](https://www.infoq.com/presentations/Simple-Made-Easy) (56:50)

- "When we start writing get this, get that, there is no purpose to this. This is just life sucking." - Rich Hickey
[https://youtu.be/VSdnJDO-xdg?t=2990](https://youtu.be/VSdnJDO-xdg?t=2990)
- "Our programming house is like a hoarder's delight: there's too much stuff in it everything is too big. We need too many people to do basic things." - Rich Hickey
[https://youtu.be/VSdnJDO-xdg?t=3340](https://youtu.be/VSdnJDO-xdg?t=3340)
- "Why did you do that [using object's to represent data]? The answer could be: 'I was using Java, and I had no choice'. That's not a great answer. But it might be the truth." - Rich Hickey
- "Nobody wants to program with mutable strings any more, why do you want to program with mutable collections? " - Rich Hickey
[https://youtu.be/-6BsiVyC1kM?t=897](https://youtu.be/-6BsiVyC1kM?t=897)
- "It's pretty easy to underestimate how much this is costing us in software development. I think it's basically a catastrophy - the way we approach aggregates. It's something I would really like to fix." - Rich Hickey
[http://blog.cognitect.com/cognicast/103](http://blog.cognitect.com/cognicast/103) (18:08)

- "Polymorphism a la carte completely changes the way you work" - Rich Hickey
- "A Person class or an account class, that's a ridiculous thing. You can't change an account any more than you can change the day of the week." - Rich Hickey
[https://youtu.be/hb3rurFxrZ8?t=2106](https://youtu.be/hb3rurFxrZ8?t=2106)
- "Place itself has no role in an informationmodel. It is only an implementation detail. If you're elevating place to a first class thing in your information model, it's only an 'information model', it's pretend, it's not doing its job." - Rich Hickey
[https://www.infoq.com/presentations/Value-Values](https://www.infoq.com/presentations/Value-Values) (15:23)

- "Operational interfaces are specific. That generates a ton more code. It actually is a counter argument to the promise of object oriented programming. One of the promises was: reuse. This is the big lie of object oriented programming. Every new thing you have to do, you write a new class. Where's the reuse in that?" - Rich Hickey
[https://www.infoq.com/presentations/Value-Values](https://www.infoq.com/presentations/Value-Values) (28:33)

- "Nothing composes with places" - Rich Hickey
[https://www.infoq.com/presentations/Value-Values](https://www.infoq.com/presentations/Value-Values) (34:25)

- "Java programmers and OO programmers have been kicking SQL. 'It requires ObjectRelationalMapping, and that's like a problem with SQL'. No! It's a problem with objects." - Rich Hickey
[https://youtu.be/VSdnJDO-xdg?t=2263](https://youtu.be/VSdnJDO-xdg?t=2263)
- "Objects are not the way the world works. Nothing in the world works that way. People don't hand their strings out to other people to start yanking on them. So that's how we're gonna have a soccer team: we're gonna have a reference to somebody else. You call pass to me. And we build this big spaghetti nightmare. This is completely not the way the world works. This is not how physics works. We say objects are a way to model the real world? It's not at all. It's a complete programming fabrication. It's not very realistic. It's not a good fit for almost anything." - Rich Hickey
[https://youtu.be/VSdnJDO-xdg?t=2274](https://youtu.be/VSdnJDO-xdg?t=2274)
- "How many times did I say 'immutability' in this talk? Immutability rocks. One of the things that are very interesting about that is: you cannot correctly represent change without immutability. It's a profound idea. It's not my idea. It's just an essential characteristic of the universe. But it really needs to be recognized in our architectures." - Rich Hickey
[https://www.infoq.com/presentations/The-Design-of-Datomic](https://www.infoq.com/presentations/The-Design-of-Datomic) (53:40)

- "If I had any recommendation to you at all, it's just if you're thinking about designing a system and you're not sure, whether you can answer all that questions in the forward direction, choose immutability. You can almost back into a little more than 50% of this design just by haven taken immutability as a constraint, saying 'oh my god now what am I gonna do? I cannot change this. I better do this!' And keep forcing you into good answers. So if I had any architectural guidance from this: Just do it. Choose immutability and see where it takes you." - Rich Hickey
[https://www.infoq.com/presentations/The-Design-of-Datomic](https://www.infoq.com/presentations/The-Design-of-Datomic) (54:06)

- "That's just Java being Java" - Rich Hickey
[http://www.infoq.com/presentations/Clojure-Reducers](http://www.infoq.com/presentations/Clojure-Reducers) (28:18)

- "It is my opinion that object oriented programming, as delivered by Java, etc., is not a good default way to structure your program." - Rich Hickey
[https://youtu.be/hb3rurFxrZ8?t=1982](https://youtu.be/hb3rurFxrZ8?t=1982)
- "[In java] you are set up to do the wrong thing." - Rich Hickey
[https://youtu.be/hb3rurFxrZ8?t=2140](https://youtu.be/hb3rurFxrZ8?t=2140)
- "State. You're doing it wrong" - Rich Hickey
[https://www.youtube.com/watch?v=dGVqrGmwOAw&feature=youtu.be&t=1272](https://www.youtube.com/watch?v=dGVqrGmwOAw&feature=youtu.be&t=1272)
- "Mutable objects are the new Spaghetti code" - Rich Hickey
[https://youtu.be/dGVqrGmwOAw?t=1322](https://youtu.be/dGVqrGmwOAw?t=1322)
- "Eventually, with mutable objects you create an intractable mess. And encapsulation does not get rid of that. Encapsulation only means: 'well I'm in charge of this mess'." - Rich Hickey
[https://youtu.be/dGVqrGmwOAw?t=1325](https://youtu.be/dGVqrGmwOAw?t=1325)
- "Every single language that allows for mutable objects has the problem that there is no standard time management." - Rich Hickey
[http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey](http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey) (10:00)

- "The OO model has gotten time wrong" - Rich Hickey
[http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey](http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey) (18:00)

- "We don't get to stop the world, especially not to observe it." - Rich Hickey
- "Perception is uncoordinated. It's massively parallel. It is not message passing." - Rich Hickey
- "But we can't screw up time and state the way we have, and have it still be easier. Because it's now wrong." - Rich Hickey
[http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey ](http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey ) (27:00)

- "As we get more concurrent, we're gonna need learn to live in a world, that's gonna proceed in spite our intention or desire or best wishes that it would not. 'Cause it would be a lot easier for us if it wouldn't. It's gonna! We're not gonna achieve the degrees of parallelism and the concurrency we want until we can accept this. And embrace it." - Rich Hickey
[http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey ](http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey ) (28:00)

- "We can consume memory in order to model time." - Rich Hickey
[http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey ](http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey ) (37:25)

- "When you get hit by lightning, who's behaving? There is no behavior." - Rich Hickey
[http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey](http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey) (40:00)

- "I think you should pick. You should either have explicit constructs [for state] or go all the way to haskell. Because everything in between is catastrophe." - Rich Hickey
[https://youtu.be/VSdnJDO-xdg?t=2790](https://youtu.be/VSdnJDO-xdg?t=2790)
- "Just take my word for it: persistent data structures are so much better." - Rich Hickey
[http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey](http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey) (40:30)

- "If you write a program that uses persistent data structures, you'll be able to sleep at night. You're gonna be happier. Your life is gonna be better. Because there's a huge quantity of things you will no longer have to worry about." - Rich Hickey
[http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey](http://www.infoq.com/presentations/Are-We-There-Yet-Rich-Hickey) (40:35)

- "It just sorta changes everything" - Rich Hickey
[https://youtu.be/4iaIwiemqfo?t=1359](https://youtu.be/4iaIwiemqfo?t=1359)
- "We should build the insides of our systems, like we build the outsides of our systems. All value propositions that accrue to systems - we want them!" - Rich Hickey
[https://youtu.be/VSdnJDO-xdg?t=2491](https://youtu.be/VSdnJDO-xdg?t=2491)
- "I don't know. I don't wanna know." - Rich Hickey
- "You have to make this rational from the systems level: 'Data orientation and dynamic typing make sense in systems. You explain to me why it doesn't inside the programs: I don't understand why it wouldn't.'" - Rich Hickey
[https://youtu.be/ROor6_NGIWU?t=3418](https://youtu.be/ROor6_NGIWU?t=3418)
- "Build your human interface on top of a programmatic interface, because programmatic interfaces are all you've got in the systems level" - Rich Hickey
[https://youtu.be/ROor6_NGIWU?t=3507](https://youtu.be/ROor6_NGIWU?t=3507)
- "One thing about abstraction is to recognize the difference between abstracting in order to simplify, and abstracting in order to hide. If abstracting is like putting paint on it, or putting it in a box and closing it because it reeks so bad. That's not good." - Rich Hickey
[https://www.infoq.com/presentations/Simple-Made-Easy-QCon-London-2012](https://www.infoq.com/presentations/Simple-Made-Easy-QCon-London-2012) (38:40)

- "By the time you're writing a service, there's nothing premature about abstraction." - Rich Hickey
[https://youtu.be/ROor6_NGIWU?t=3643](https://youtu.be/ROor6_NGIWU?t=3643)
- "Down in the small in a program you can overabstract, up here you can't" - Rich Hickey
[https://youtu.be/ROor6_NGIWU?t=3658](https://youtu.be/ROor6_NGIWU?t=3658)
- "Clojure is in a unique position in providing maybe the friendliest face ever presented to functional programming that's out there" - Rich Hickey
[https://youtu.be/dGVqrGmwOAw?t=1407](https://youtu.be/dGVqrGmwOAw?t=1407)
- "Clojure solves the problem that you don't know you have." - Rich Hickey
[https://youtu.be/oyLBGkS5ICk?t=2692](https://youtu.be/oyLBGkS5ICk?t=2692)
- "Now, we're in ClojureScript. Do we need sugar for JavaScript? We're like chocolate syrup for JavaScript...with whipped cream and cherries and sprinkles and everything! Right. So we do not need sugar for JavaScript. And we have macros - which is like your own hot fudge machine." - Rich Hickey
[https://www.youtube.com/watch?v=tVooR-dF_Ag&t=1h15m30s](https://www.youtube.com/watch?v=tVooR-dF_Ag&t=1h15m30s)
- "Learning requires inefficiency" - Rich Hickey
[http://www.infoq.com/presentations/design-composition-performance-keynote](http://www.infoq.com/presentations/design-composition-performance-keynote) (35:00)

- "So how do we change our software? Apparently, I heard in a talk today, that Agile and Extreme Programming have shown that refactoring and tests allow us to make change with zero impact. 
I never knew that. I still do not know that.
That's not actually a knowable thing. That's phooey." - Rich Hickey
[https://www.infoq.com/presentations/Simple-Made-Easy](https://www.infoq.com/presentations/Simple-Made-Easy) (14:11)

- "What goes in the cache? What form does it take? When does it get invalidated? Whose problem are all these questions? Yours! Your problem! Or maybe you're buying some fancy ORM that makes it your problem with another a layer ontop of your problem. Now you have two problems." - Rich Hickey
[https://youtu.be/Cym4TZwTCNU?t=827](https://youtu.be/Cym4TZwTCNU?t=827)
- "Instruments are made for people who can play them. Isn't that outrageous? Isn't that scandalous? The are made for people who can actually play them. And that's a problem. Because beginners can't play. They're not yet players. The don't know how to do it. Again, I think, there should be outrage on the internet. We should submit patches. We should fix like the Cello. Should Cellos auto-tune? Or maybe they should have red and green lights. It's green when you're in tune, it's red when you're not in tune. Or maybe they shouldn't make any sound at all until you get it right. Is that how it works? is that what we want? No, that's not how it works. Look at these kid's. They're being subjected to cellos. There's nothing helping them here. [...] They're smaller but those are real cellos. They're hard to play, they're awkward, the sound terrible. They're out of tune. It's gonna be tough for a while for these kids" - Rich Hickey
[https://www.infoq.com/presentations/Design-Composition-Performance](https://www.infoq.com/presentations/Design-Composition-Performance) (32:00)

- "As a simple example: here's a guitar player, a harp player, a double bass player all holding up their blisters. Imaging if you downloaded a library off the internet and it gave you blisters! The horror. And yet, every musician has overcome a barrier of entry similar to this." - Rich Hickey
[https://www.infoq.com/presentations/Design-Composition-Performance](https://www.infoq.com/presentations/Design-Composition-Performance) (33:45)


 ## Micha Niskin

- "For me Clojure is very unique. Things like boot, javelin and hoplon are very rewarding to me. They're things, as far as my use of them, professionally to make money and to get actual work done, they're pretty much done. They do everything we need them to do. And we're moving on, you know, we're thinking about other problems now. And we don't need to keep solving these problems. And I have never experienced that before using Clojure." - Micha Niskin
[https://s3.amazonaws.com/cognicast/shows/cognicast-111-das-boot.mp3](https://s3.amazonaws.com/cognicast/shows/cognicast-111-das-boot.mp3) (59:45)

- "Using other languages I could never form the abstractions that were durable and composable enough to be used in the next project. I would always end up having to rewrite something or solve the same problem over and over again. I had never experienced actually solving a problem before. Or even thinking it was something that is worth spending your time on trying to do. Like trying to solve the problem of making websites once and for all. And that's all due to Clojure I think." - Micha Niskin
[https://s3.amazonaws.com/cognicast/shows/cognicast-111-das-boot.mp3](https://s3.amazonaws.com/cognicast/shows/cognicast-111-das-boot.mp3) (59:45)


 ## Robert Martin

- "What language is it that meets all the criteria? What language would I choose if I had to choose today? Probably Clojure!" - Robert Martin
[https://youtu.be/qxYuvnjUTxM?t=3110](https://youtu.be/qxYuvnjUTxM?t=3110)

 ## Colin Fleming

- "At the conceptual level of what the application is doing, it's nearly always a flow of data through your program. And how you're manipulation that data. And all the rest is just the noise around that. That is one of the big philosophical revelations that Clojure is helping with." - Colin Fleming
[http://talkingkotlin.com/Writing-A-Clojure-IDE-in-Kotlin-with-colin-fleming/](http://talkingkotlin.com/Writing-A-Clojure-IDE-in-Kotlin-with-colin-fleming/) (35:06)


 ## Neal Ford

- "Clojure does for concurrency what Java did for memory management" - Neal Ford
[https://youtu.be/bxLnpgnDApg?t=192](https://youtu.be/bxLnpgnDApg?t=192)
- "To build a brand new language and use lisp syntax on the JVM, you either gotta be a crazy person, or got some really cool ulterior motive. I met Rich and he's not a crazy person." - Neal Ford
[https://youtu.be/bxLnpgnDApg?t=269](https://youtu.be/bxLnpgnDApg?t=269)
- "Meta-programming in Clojure is just programming" - Neal Ford
[https://youtu.be/bxLnpgnDApg?t=1736](https://youtu.be/bxLnpgnDApg?t=1736)
- "In Clojure, because the language is so bendable, you actually bend language towards the problem, not the problem towards the language." - Neal Ford
[https://youtu.be/bxLnpgnDApg?t=1824](https://youtu.be/bxLnpgnDApg?t=1824)
- "People ask me what projects I would choose Clojure for. The answer is: the nastiest, hardest, toughest kinds of projects possible. Because it's those projects where you need the ability to mold your language towards your problem, not vice versa" - Neal Ford
[https://youtu.be/bxLnpgnDApg?t=1877](https://youtu.be/bxLnpgnDApg?t=1877)
- "The two most sophisticated projects we have going on in the world right now, are both Clojure projects, on purpose. Because we think this is the only way these projects can be done." - Neal Ford
[https://youtu.be/bxLnpgnDApg?t=1895](https://youtu.be/bxLnpgnDApg?t=1895)
- "With Clojure you are bringing a gun to a knifefight" - Neal Ford

 ## Robert Stuttaford

- "If you think about the grand mission that I think Rich [Hickey] has. And again I maybe putting words in his mouth here, but I think he's trying to solve programming. 
" - Robert Stuttaford
[https://soundcloud.com/defn-771544745/7-dataomic-with-robert-stuttaford](https://soundcloud.com/defn-771544745/7-dataomic-with-robert-stuttaford) (43:20)

- "When I found this Clojure thing, and saw this extreme focus on simplicity. It felt like the way. The capital doubly way." - Robert Stuttaford
[https://soundcloud.com/defn-771544745/7-dataomic-with-robert-stuttaford](https://soundcloud.com/defn-771544745/7-dataomic-with-robert-stuttaford) (16:25)

- "It really felt to me very quickly, once I got my head around the basics, that is was gonna be more risky not to use this language than to use it." - Robert Stuttaford
[https://zadevchat.io/27/](https://zadevchat.io/27/) (16:40)

- "I'll be very honest. Clojure did not map to the way I thought about the world, it mapped to the way I wanted to think about the world. It was very much an unlearning not a learning." - Robert Stuttaford
[https://zadevchat.io/27/](https://zadevchat.io/27/) (27:05)

- "If you work with data, that's a great fit. And we all work with data, right?" - Robert Stuttaford
[https://zadevchat.io/27/](https://zadevchat.io/27/) (42:05)

- "[With Datomic] you forget that time is passing, because you don't worry about it anymore." - Robert Stuttaford
[https://zadevchat.io/27/](https://zadevchat.io/27/) (1:01:45)

- "I've been using it for four years now and it still blows the top of my head off." - Robert Stuttaford
[https://zadevchat.io/27/](https://zadevchat.io/27/) (1:01:50)

- "It's immutable because it's immutable. It's a bit tautological." - Robert Stuttaford
[https://zadevchat.io/48/](https://zadevchat.io/48/) (43:46)

- "I would highly recommend anybody who's already in the JVM space, I pretty much think you should stop what you're doing and take a look right now. Because it's almost certainly gonna solve a whole world of hurt you may already find yourself in." - Robert Stuttaford
[https://zadevchat.io/48/](https://zadevchat.io/48/) (1:06:23)


 ## Alex Miller

- "The data parts of Clojure are fantastic. They allow us to get an amount of reuse that I never saw in any OO system I reused. Which was always the promise: there's this object and I can use it in lots of different ways. And I have not found that to be the case in practice. Whereas I find that the data centric approach and the generic programming model that Clojure provides to provide a tremendous amount of reuse." - Alex Miller
[https://www.infoq.com/presentations/clojure-spec](https://www.infoq.com/presentations/clojure-spec) (6:40)


 ## Tim Ewald

- "We often say we should use the right tool for the right job. And it's absolutely true. It's an interesting expression though. I haven't heard anyone apply it to a tool that they didn't like." - Tim Ewald
[https://youtu.be/ShEez0JkOFw?t=95](https://youtu.be/ShEez0JkOFw?t=95)
- "It's all just chisels. All the way down" - Tim Ewald
[https://youtu.be/ShEez0JkOFw?t=702](https://youtu.be/ShEez0JkOFw?t=702)
- "There's always a limit [to automated tools]. And it affects what you do." - Tim Ewald
[https://youtu.be/ShEez0JkOFw?t=1539](https://youtu.be/ShEez0JkOFw?t=1539)
- "The tools that you use shape how you look at the world." - Tim Ewald
[https://youtu.be/ShEez0JkOFw?t=2502](https://youtu.be/ShEez0JkOFw?t=2502)
- "I want tools that enable me do unique things. Tools that don't change my perspective. [...] And I believe Clojure is a perfect toolset for doing this." - Tim Ewald
[https://youtu.be/ShEez0JkOFw?t=3286](https://youtu.be/ShEez0JkOFw?t=3286)
- "IOC, the injection of complexity" - Tim Ewald
[https://youtu.be/ShEez0JkOFw?t=3466](https://youtu.be/ShEez0JkOFw?t=3466)
- "I'll be forever grateful to Rich for giving us a toolset that is mercilessly and mercifully simple. It's merciless in its pursuit of simplicity, and in giving us that, it's merciful to us." - Tim Ewald
[https://www.youtube.com/watch?v=ShEez0JkOFw&feature=youtu.be&t=3471](https://www.youtube.com/watch?v=ShEez0JkOFw&feature=youtu.be&t=3471)

 ## Eric Normand

- "That's the secret for making things composable: start with the composition - before you even define how the thing will work" - Eric Normand
[https://youtu.be/jJIUoaIvD20?t=1516](https://youtu.be/jJIUoaIvD20?t=1516)

 ## Michael Nygard

- "This is why I say Datomic is more relational than Oracle. Because a value of a Datomic database IS a relation over the space of the possible values for that schema. And you go from one relation to another relation." - Michael Nygard
[http://blog.cognitect.com/cognicast/034-michael-nygard](http://blog.cognitect.com/cognicast/034-michael-nygard) (27:05)


 ## Michael Fogus

- "TDD. But not the one you think I'm talking about. [Test Driven Dentistry]. And what that means is: not everything should be test driven." - Michael Fogus
[https://youtu.be/NnSpaR67hXg?t=642](https://youtu.be/NnSpaR67hXg?t=642)
- "Do you ever feel like you're being boilerplated alive?" - Michael Fogus
[https://youtu.be/0JXhJyTo5V8?t=2083](https://youtu.be/0JXhJyTo5V8?t=2083)
- "Well-formed Data at rest is as close to perfection in programming as it gets. All the crap that had to happen to put it there however.." - Michael Fogus
[https://twitter.com/fogus/status/454582953067438080](https://twitter.com/fogus/status/454582953067438080)

 ## Adrien Cockroft

- "A lot of the best programmers and the most productive programmers I know are writing everything in Clojure and swearing by it, and then just producing ridiculously sophisticated things in a very short time. And that programmer productivity matters." - Adrien Cockroft
[https://thenewstack.io/the-new-stack-makers-adrian-cockcroft-on-sun-netflix-clojure-go-docker-and-more/](https://thenewstack.io/the-new-stack-makers-adrian-cockcroft-on-sun-netflix-clojure-go-docker-and-more/)

 ## Stuart Halloway

- "If you have more things than names, your design is broken" - Stuart Halloway
[https://youtu.be/SNVbipqw3SM?t=987](https://youtu.be/SNVbipqw3SM?t=987)
- "If there are more concepts than names [in a diagram], it's not simple yet" - Stuart Halloway
[https://youtu.be/SNVbipqw3SM?t=687](https://youtu.be/SNVbipqw3SM?t=687)
- "'This class remains empty, only used for the above annotations'. We know you're doing some good complexity when you find yourself having to say things like that" - Stuart Halloway
[https://vimeo.com/77199361](https://vimeo.com/77199361) (7:30)

- "Nothing says 'Screw You!' like a DSL" - Stuart Halloway
[https://vimeo.com/77199361](https://vimeo.com/77199361) (8:00)

- "All that stuff we have done about encoding data in the Clojure ecosystem and in the Datomic ecosystem wouldn't have to exist, if JSON didn't suck" - Stuart Halloway
[http://www.datomic.com/day-of-datomic-2016-part-2.html](http://www.datomic.com/day-of-datomic-2016-part-2.html) (2:40)
