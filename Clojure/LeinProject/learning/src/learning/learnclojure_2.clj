(ns learning.state)

(def x "Hello")

(if (empty? x)
  "X is empty"
  "X is not empty")

(if (empty? x)
  nil
  (do
    (println "yep")
    :ok))


(if-not (empty? x)
  (do
    (println "yep")
    :ok))

(when-not (empty? x)
  (do
    (println "yep")
    :ok))


(case x
  "GoodBye" :goodbye
  "Hi" :hi
  "Hello" :hello
  :nothing)


(cond
  (= "goobye") :goodbye
  (= (apply (reverse x)) "olleH") :olleh
  :otherwise :nothing)







