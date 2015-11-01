Basic example howto build ClojureScript
---------------------------------------

Directions
----------

    ./download-cljs-jar.sh
    ./build-nodejs-myapp.sh
    node myapp.js

Which is really just:

    wget https://github.com/clojure/clojurescript/releases/download/r1.7.145/cljs.jar
    java -cp cljs.jar:src/cljs clojure.main build-nodejs-myapp.clj
    node myapp.js

The myapp.js source script calls `goog.require()` on files from `out/`:

    require('out/goog/bootstrap/nodejs.js')
    require('out/cljs_deps.js')
    goog.require("myapp.core")     //Google Clojure namespaces
    goog.require("cljs.nodejscli") //Google Clojure namespaces

You could also add:

    npm install source-map-support

to get source map output on errors for `src/cljs/myapp/core.cljs`
