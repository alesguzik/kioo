(defproject kioo-example "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :jvm-opts ^:replace ["-Xmx1g" "-server"]

  :dependencies [[kioo "0.4.1-SNAPSHOT"]
                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3211"]
                 [om "0.7.3"]]

  :plugins [[lein-cljsbuild "1.0.6"]]

  :source-paths ["src"]
  :resource-paths ["resources"]
  
  :cljsbuild { 
    :builds [{:id "dev"
              :source-paths ["src"]
              :compiler {
                :output-to "app.js"
                :pretty-print true         
                :optimizations :simple}}]})
