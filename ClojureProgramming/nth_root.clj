(def tolerance 0.00001)

(defn abs [n] (if (< n 0) (- n) n))

(defn average 
  [a b] 
  (/ (+ a b) 2.0))

(defn exp 
  [b n]
  (if (= n 0)
    1
    (* b (exp b (- n 1)))))

(defn close-enough? 
  [a b]
  (< (abs (- a b)) tolerance))

(defn fixed-point [f first-guess]
  (defn tri [guess]
    (let [nxt (f guess)]
      (if (close-enough? guess nxt)
        nxt
        (tri nxt))))
  (tri first-guess))

(defn average-damping [f]
  (fn [x] (average x (f x))))

(defn compose [f g]
  (fn [x] (f (g x))))

(defn repeated [f n]
  (if (= n 1)
    f
    (compose f (repeated f (- n 1)))))

(defn logB [n b]
  (/ (Math/log n) (Math/log b)))

(defn nth-root [x n]
  (let [counter (Math/floor (logB n 2))]
    (if (= counter 0)
      x
    (fixed-point ((repeated average-damping (int counter)) (fn [y] (/ x (exp y (- n 1))))) 
                 1.0))))

;; 1024 ^ (1 / 10)
(println (nth-root 1024 10))

;; 64 ^ (1 / 2)
(println (nth-root 64 2))
