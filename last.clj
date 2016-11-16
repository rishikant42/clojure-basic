(defn last
  [items]
  (if (= (count items) 1)
    (first items)
    (last (rest items))))

(println (last '(1 2 3 4 5)))
(println (last "hello"))
