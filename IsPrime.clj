(defn doPrime [x]
  (loop [iter 2 top (int (Math/sqrt x))]
    (if (> iter top)
      true
      (if (= 0 (mod x iter))
        false
        (recur (inc iter) top)))))

(defn is-prime? [x]
  (if (< x 2)
    false
    (doPrime x)))
  
(defn prime-from [num]
  (filter is-prime? (iterate inc num))
  )

(defn prime-seq [from to]
  (for [x (prime-from from) :while (<= x to)] x)
  )

(is-prime? 101)
(prime-seq 100 200)
