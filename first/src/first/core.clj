(ns first.core)

(defn foo
  [x y]
  (println (+ x y)))

(foo 10 20)

(println (+ (* 3 5) (- 10 6)))

(defn square [x]
  (* x x))

(defn sum-of-squares
  [x y]
  (+ (square x) (square y)))

(sum-of-squares 3 4)

(defn f
  [a]
  (sum-of-squares (+ a 1) (* a 2)))

(f 5)



(defn more
  [x y]
  (cond
    (<= x y) y
    :else x))


(defn practice
  [x y z]
  (cond (and (>= x z) (>= y z))
        (sum-of-squares x y)
        (and (>= y x) (>= z x))
        (sum-of-squares y z)
        (and (>= z y) (>= x y))
        (sum-of-squares z x)
        :else 10
        )
  )

(defn a-plus-abs-b
  [a b]
  ((if (> b 0)
     + -)
    a b))
;
;(defn p
;  p)
;(defn test1
;  [x y]
;  (if (= x 0) 0 y)
;  )
;

;(test1 0 p)

(defn average
  [x y]
  (/ (+ x y) 2)
  )

(defn improve
  [guess x]
  (average guess (/ x guess))
  )
(defn abs
  [x]
  (if (< x 0) - +)
  x)

(defn good-enough?
  [guess x]
  (< (abs (- (square guess) x)) 0.001))

(defn sqrt-iter
  [guess x]
  (if (good-enough? guess x)
    guess)
  (sqrt-iter (improve guess x) x)
  )

(defn sqrt
  [x]
  (sqrt-iter 1.00 x))

(println (sqrt 9))



