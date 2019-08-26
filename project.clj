(defproject external-react-example "0.0.1"
  :description "An example of external react with advanced optimizations usage"

  :dependencies  [[org.clojure/clojure "1.10.1"]
                  [org.clojure/clojurescript "1.10.520"]]

  :plugins [[lein-cljsbuild "1.1.7"]]

  :cljsbuild
  {:builds
   [{:source-paths ["src/cljs/external_react_example"]
     :compiler
     {;; see https://cljs.github.io/api/compiler-options/optimizations
      :optimizations :advanced
      ;; do not read, because we manage npm-deps manually
      ;; see https://cljs.github.io/api/compiler-options/npm-deps
      :npm-deps false
      ;; see https://cljs.github.io/api/compiler-options/foreign-libs
      :foreign-libs
      [{:file "dist/index_bundle.js"
        :provides ["react" "react-dom"]
        :global-exports {react React
                         react-dom ReactDOM}}]}}]}

  :clean-targets
  ^{:protect false}
  ["resources/private/js"
   "resources/public/js"
   :target-path])
