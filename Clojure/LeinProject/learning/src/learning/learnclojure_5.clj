(ns learnclojure)

(defn sum-numbers [vals]
  (loop [total 0 vals vals]
  (if(empty? vals)
    total
    (recur(+ (first vals) total) (rest vals)))))


(defn multiply-number
  ([vals] (multiply-number 1 vals))
  ([total vals]
    (if (empty? vals)
      total
      (multiply-number ( * (first vals) total) (rest vals)))))


  (defn multiply-number [vals]
    (loop [total 1 vals vals]
    (if (empty? vals)
      total
      (recur ( * (first vals) total) (rest vals)))))


  (multiply-number [2 4 6 8])

  (sum-numbers [1 2 3 4 5])


  (reduce (fn [total vals] (+ total vals)) 0 [1 2 3 4])

  (defn group-even [acc next-val]
    (let [key (if (even? next-val) :even :odd)]
      (update-in acc [key] #(conj % next-val))))

  (reduce group-even {} [1 2 3 4 5 6 7 8])
