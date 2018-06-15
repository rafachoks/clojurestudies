(ns learning.func)

(def hello (fn [] "Hello"))

(defn hello [] "Hello stranger")

(defn hello [name] (str "Hello: " name))

(defn hello "Greets a person with <name> and say the name of the chosen <title> of movie" [name title] (str "Hello: " name " you choosed the movie: " title))

(require '[clojure.repl :refer [doc]])
(doc hello)

(defn hello
  ([] "Hello strager")
  ([name] (str "Hello, " name)))

(hello "Rafa")
