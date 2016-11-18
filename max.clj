(defn max
  [& args]
  (defn iter [res items]
    (cond (empty? items) res
          (> (first items) res) (iter (first items) (rest items))
          :else (iter res (rest items))))
  (iter (first args) (rest args)))

(println (max 3 2 5 4 1))
