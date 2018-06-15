(ns learning.core
  (:gen-class)
  (:require [clojure.string :as st]
            [learning.util :as ut]))


(st/split "a,b,c" #",")

(defn my-getname [this]
  "MyClass's Name in core")
