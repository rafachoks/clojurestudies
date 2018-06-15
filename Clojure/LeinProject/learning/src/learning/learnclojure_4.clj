(ns learning.type2)

(def x (list 1 2 3))
(def v [4 5 6])

(first x)
(second x)
(nth x 1)
(conj x 0)
(conj v 0)
(concat x v)
(hash-map :a 1 :b 2)
(array-map :a 1 :b 2)
(type (hash-map :a 1 :b 2))
(type (array-map :a 1 :b 2))


(assoc {:a 1} :b 2)A
(assoc-in {:settings {:a 1 :b 2}} [:settings :a] "a")
(update-in {:settings {:a 1 :b 2}} [:settings :a] inc)
