(defn split-at
  [coll n]
  (defn iter [start end counter]
    (if (= counter 0)
      (list start end)
      (iter (concat start (list (first end)))
            (rest end)
            (dec counter))))
  (iter '() coll n))

(println (split-at '(0 1 2 3 4 5) 3))
(println (split-at '(0 1 2 3 4 5) 1))
