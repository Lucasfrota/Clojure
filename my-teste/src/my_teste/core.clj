(ns my-teste.core
  (:gen-class))

(defn -main
  [& args]
  (println "Hello stranger"))

(defn sum
	[a b]
	(+ a b))

(defn junta
	[palavra1 palavra2]
	(println (str palavra1 " " palavra2 ) )
	)