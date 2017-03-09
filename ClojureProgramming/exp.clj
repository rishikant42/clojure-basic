(defn exp [b n]
  (if (= n 0)
    1
    (* b (exp b (dec n)))))

(println (exp 2 10))
