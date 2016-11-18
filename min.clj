(defn min
  [& args]
  (defn iter [res items]
    (cond (empty? items) res
          (< (first items) res) (iter (first items) (rest items))
          :else (iter res (rest items))))
  (iter (first args) (rest args)))

(println (min 3 2 5 1 0 4))
