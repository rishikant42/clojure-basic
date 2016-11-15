(defn cons [x y]
  (fn [m]
    (cond (= m 0) x
          (= m 1) y
          :else (println "Argument not 0 or 1 -- CONS"))))

(defn first [z] (z 0))

(defn rest [z] (z 1))

(println (first (cons 1 '(2 3 4))))
(println (rest (cons 1 '(2 3 4))))

;; (defn sqr1 [x] (* x x))
;; 
;; (def sqr2 (fn [x] (* x x)))
;; 
;; (println (sqr1 5))
;; (println (sqr2 5))
;; 
;; (println ((fn [x] (* x x)) 6))
