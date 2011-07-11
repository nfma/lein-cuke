(ns leiningen.cuke-gems
  (:use [leiningen.cuke :only [jruby]]))

(defn cuke-gems
  "Install the Ruby Gems that are necessary to run Cucumber."
  [project]
  (jruby "-S gem install -i lib/gems --no-rdoc --no-ri -v 1.0.0 cucumber"))
