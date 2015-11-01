(require '[cljs.build.api :as b])

(b/build "src/cljs"
 {:main 'myapp.core
  :output-to "myapp.js"
  :output-dir "out"
  :target :nodejs
  :verbose true})
