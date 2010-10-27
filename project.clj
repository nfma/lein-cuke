(defproject org.clojars.mjul/lein-cuke "0.3.3-PATCH"
  :description "Cucumber runner for Leiningen (lein)"
  :dependencies [[leiningen "1.3.1"] 
                 [gherkin "2.2.4"]
                 [cuke4duke "0.3.2" :exclusions [gherkin]]]
  :dev-dependencies [[lein-clojars "0.6.0"]])

