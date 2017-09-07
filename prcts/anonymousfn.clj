user=> (defn mul [x, y] (* x y))
#'user/mul
user=> (mul 2 3)
6
user=> (fn [x y] (* x y))
#<user$eval89$fn__90 user$eval89$fn__90@1cf0b007>
user=> ((fn [x y] (* x y)) 2 3)
6
user=> #(* %1 %2)
#<user$eval99$fn__100 user$eval99$fn__100@1681b50e>
user=> (#(* %1 %2) 2 3)
6
user=>
