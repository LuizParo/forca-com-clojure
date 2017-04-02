(ns forca.fibonacci
    (:gen-class))

(defn fibonacci[x]
    (if (< x 2)
        x
        (+ (fibonacci (- x 1)) (fibonacci (- x 2)))
    )
)