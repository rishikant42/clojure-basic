(defn even?
  [n]
  (if (= (mod n 2) 0)
    true
    false))

;; (println (even? 5))
;; (println (even? 0))
