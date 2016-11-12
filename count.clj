(defn count
  [items]
  (if (empty? items)
    0
    (+ 1 (count (rest items)))))

;; (println (count '(a b c d)))
;; (println (count nil))
;; (println (count "abcd"))
