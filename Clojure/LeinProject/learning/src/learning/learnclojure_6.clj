(ns  learning.java
  (:import [java.util Date Calendar]))


  (Date.)
  (. (Date.) getTime)
  (.getTime (Date.))

  (doto (Calendar/getInstance)
  (.set Calendar/YEAR 1986)
  (.set Calendar/MONTH 9)
  (.set Calendar/DATE 22))



  (int-array 100)

  (def myarray (into-array String ["this" "is" "an" "array"]))

  (aget myarray 0)
  (aset myarray 0 "How to be a Jedi in this stuff XD")

  (amap myarray idx ret ( aset ret idx (apply str ( reverse ( aget myarray idx)))))
