(defn even?
  [n]
  (if (not= (mod n 2) 0)
    true
    false))

;; (println (odd? 5))
;; (println (odd? 0))
