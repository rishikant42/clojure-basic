(def emp-list '())

(defn map
  [proc items]
  (if (empty? items)
    emp-list
    (cons (proc (first items))
          (map proc (rest items)))))

;; (defn square [x] (* x x))
;; 
;; (println (map square '(1 2 3 4 5)))
;; (println (map inc '(1 2 3 4 5)))
