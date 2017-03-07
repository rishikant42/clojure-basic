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

(println (sqrt 2))
