(defn nth
  [items n]
  (if (= n 0)
    (first items)
    (nth (rest items) (dec n))))

(println (nth '(0 1 2 3 4 5 6) 2))
(println (nth '["a" "b" "c" "d"] 2))
