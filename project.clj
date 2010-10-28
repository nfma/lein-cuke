(defproject org.clojars.mjul/lein-cuke "0.4.3-SNAPSHOT"
  :description "Cucumber runner for Leiningen (lein)"
  :repositories {;"codehaus" "http://repository.codehaus.org",
		 "cukes" "http://cukes.info/maven"}
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
		 [leiningen "1.3.1"]
                 [cuke4duke "0.4.3-SNAPSHOT"]]
  :dev-dependencies [[lein-clojars "0.6.0"]])

