(defproject coin-changer-kata "0.1.0-SNAPSHOT"
  :description "Coin Changing App in Clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [proto-repl "0.3.1"]
                 [proto-repl-charts "0.3.1"]]

  :profiles
  {:dev {:source-paths ["dev" "src" "test"]
         :dependencies [[org.clojure/tools.namespace "0.2.11"]]}})
