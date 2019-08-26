# A small example of using `:optimizations :advanced` with webpack bundle

Based on https://clojurians.slack.com/archives/C073DKH9P/p1566831814069000

# How to run

```
yarn install
...
yarn webpack
...
lein cljsbuild once
...
```
After that you can open the `index.html` and check if everyting is OK.
You should see a "Hello World" in `h1` that was rendered by the following code

```clojurescript
(react-dom/render
 (react/createElement "h1" nil "Hello World")
 (.getElementById js/document "app"))
```

# Materials

[ClojureScript with Webpack](https://clojurescript.org/guides/webpack)
[NPM Modules](https://figwheel.org/docs/npm.html)