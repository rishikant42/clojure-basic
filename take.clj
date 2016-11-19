(defn take-rec
  [n coll]
  (if (= n 0)
    '()
    (cons (first coll)
          (take-rec (dec n) (rest coll)))))

(defn take
  [n coll]
  (cond (> n (count coll)) coll
        (<= n 0) '()
        :else (take-rec n coll)))

(println (take 3 '(1 2 3 4 5 6)))
(println (take 0 '(1 2 3 4 5 6)))
(println (take 6 '(1 2 3 4 5 6)))
(println (take 16 '(1 2 3 4 5 6)))
(println (take -6 '(1 2 3 4 5 6)))
