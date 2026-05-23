;; helwor.clj
(ns hu.helwor
  (:require 
    [io.github.humbleui.ui :as ui]))

(ui/defcomp app []
  [ui/center
   [ui/label "Hello, world"]])
  
(defn -main [& args]
  (ui/start-app!
    (ui/window
      {:exit-on-close? false}
      #'app)))
