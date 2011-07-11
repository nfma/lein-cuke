(defproject nfma/lein-cuke "1.1.0-PATCH-3"
  :description "Cucumber runner for Leiningen (lein)"
  :repositories {"codehaus" "http://repository.codehaus.org",
		 "cukes" "http://cukes.info/maven"}
  :dependencies [[cuke4duke "0.3.2" :exclusions [gherkin]]]
  :dev-dependencies [[lein-clojars "0.6.0"]])
