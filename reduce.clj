(defn accumulate
  [op init items]
  (if (empty? items)
    init
    (op (accumulate op init (rest items))
        (first items))))

(defn reduce
  [op items]
  (cond (= op +) (accumulate + 0 items)
        (= op *) (accumulate * 1 items)
        (= op /) (accumulate / (/ (first items) (first (rest items))) (rest (rest items)))
        (= op -) (accumulate - (- (first items) (first (rest items))) (rest (rest items)))
        :else (do (println "Unknown operator") (System/exit 1))))


;; (println (reduce - '(1 2 3 4 5)))
;; (println (reduce / '(1 2 3 4 5)))
;; (println (reduce - '(-5 6  2 4 5 -5)))
;; (println (reduce * '(-5 6  2 4 5 -5 -9 11)))
