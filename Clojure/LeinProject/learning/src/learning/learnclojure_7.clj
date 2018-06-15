(ns learnclojure.core)

(deftype MyPerson [name])

(.name (->MyPerson "Rafa"))

(defrecord MyRecordName [name])

(map->MyRecordName {:name "Jorge"})

(deftype MyRunnable [name]
  Runnable
  (run [this] (println (.name this))))


(.run (MyRunnable. "Giulia"))


(deftype MyAGe [age])
(.age (->MyAGe 28))





