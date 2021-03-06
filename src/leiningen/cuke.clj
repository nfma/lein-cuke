(ns leiningen.cuke
  (:use  [clojure.contrib.str-utils2 :only (join)]
         [leiningen.compile :only [eval-in-project]]))


(defn jruby [options]
  (.run (org.jruby.Main.
         (doto (org.jruby.RubyInstanceConfig.)
           (.setEnvironment {"GEM_PATH" "lib/gems"})))
        (.split options " ")))

(def *exit-status* 0)

(defn cuke
  "Run cucumber features"
  [project & args]
  (try (eval-in-project project
    `(if-not (zero? (.getStatus (.run (org.jruby.Main.
                                    (doto (org.jruby.RubyInstanceConfig.)
                                      (.setEnvironment {"GEM_PATH" "lib/gems"})))
                                  (into-array (map str ["lib/gems/bin/cucumber" ~@args])))))
       (throw (Exception. "Cucumber failed!")))
    (fn [java]
      (.setFork java false)))
    (System/exit 0)
    (catch Exception e (System/exit 1))))
