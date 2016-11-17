(defn concat
  [list1 list2]
  (if (empty? list1)
    list2
    (cons (first list1)
          (concat (rest list1) list2))))

(println (concat '(1 2 3) '(4 5 6)))

(println (concat "abc" "def"))
