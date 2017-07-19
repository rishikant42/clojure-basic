(ns my-stuff.core
  (:gen-class))

(defn abs [n] (if (< n 0) (- n) n))

(defn square [x] (* x x))

(defn average
  [a b]
  (/ (+ a b) 2.0))

(defn good-enough-1?
  [guess x]
  (< (abs (- (square guess) x)) 0.00001))

(defn improve-1
  [guess x]
  (average guess (/ x guess)))

(defn sqrt-iter 
  [guess x]
  (if (good-enough-1? guess x)
    guess
    (sqrt-iter (improve-1 guess x)
               x)))

(defn sqrt
  [n]
  (sqrt-iter 1.0 n))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; (println (sqrt (first args)))
  (println (sqrt (read-string (first args))))
  (println "Hello, World!"))
