(defn reverse
  [coll]
  (defn iter [result items]
    (if (empty? items)
      result
      (iter (cons (first items) result)
            (rest items))))
  (iter '() coll))

(println (reverse '(1 2 3 4 5)))
(println (reverse "abcd"))
