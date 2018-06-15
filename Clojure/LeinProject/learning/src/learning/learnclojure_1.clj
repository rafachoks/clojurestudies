(ns learning.type)


(type 1)
(type "")
(type true)
(type (keyword "a"))
(type (quote a))
(type (list 1 2 3))
(type (vector 1 2 4))
(nth (vector 1 2 3) 1)
(last (list 1 2 3))


{:a 1 :b 1 :c 1}

(type #{1 2 3 4})
