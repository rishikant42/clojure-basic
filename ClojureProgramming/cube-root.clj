(defn square [x] (* x x))

(defn cube [x] (* x x x))

(defn abs [n] (if (< n 0) (- n) n))

(defn average
  [a b]
  (/ (+ a b) 2.0))

(defn good-enough?
  [guess x]
  (< (abs (- (cube guess) x)) 0.00001))

(defn improve
  [guess x]
  (average guess (/ x (square guess))))

(defn cube-iter 
  [guess x]
  (if (good-enough? guess x)
    guess
    (cube-iter (improve guess x)
               x)))

(defn cube-root
  [n]
  (cube-iter 1.0 n))

(println (cube-root 27))
