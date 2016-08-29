(ns darkdungeon.core
  (:require [cljs.core.async :as a])
  (:require-macros [cljs.core.async.macros :refer [go go-loop]]))

(def render (js/PIXI.WebGLRenderer. 800 600))

(let [canvas (js/document.getElementById "canvas")]
  (.replaceChild js/document.body (.-view render) canvas))
