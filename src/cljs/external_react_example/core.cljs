(ns external-react-example.core
  (:require [react]
            [react-dom]))

(react-dom/render
 (react/createElement "h1" nil "Hello World")
 (.getElementById js/document "app"))
