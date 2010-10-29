# lein-cuke

lein-cuke is a [Leiningen](http://github.com/technomancy/leiningen) plugin that provides
[Cucumber](http://cukes.info) support via [cuke4duke](http://github.com/aslakhellesoy/cuke4duke)

For a tutorial on how to use lein-cuke and Cucumber in your Clojure
projects refer to my  
[Cucumber Tutorial](http://github.com/mjul/cucumber-tutorial).

## Installation

   Add something like `[org.clojars.mjul/lein-cuke "1.0.0"]` to the `:dev-dependencies` block in your project.clj, like:

    (defproject pickles "0.0.1"
      :description "Vinegar + cucumber + time"
      :repositories [["clojars" "http://clojars.org/repo"]]
      :dev-dependencies [[org.clojars.mjul/lein-cuke "1.0.0"]])

   Look [here](http://clojars.org/org.clojars.mjul/lein-cuke) for the latest version.

## Usage

Do this:

    $ lein deps # install dependencies in lib/
    $ lein cuke-gems # install needed gems
    $ # create cucumber hierarchy - todo: add a target for this
    $ lein cuke # start red-green-refactoring!
    $ lein cuke --verbose # to get verbose information from Cucumber
