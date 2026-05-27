;; core.clj
(ns hu.triar.core
  (:require 
    [io.github.humbleui.ui :as ui]
    [io.github.humbleui.window :as win]
    [hu.triar.logic :as lg]
    [hu.triar.gui :as gui]))

(def *state-a
  (ui/signal {:text ""}))

(def *state-b
  (ui/signal {:text ""}))

(def *state-c
  (ui/signal {:text ""}))
  
(def *area
  (ui/signal 0))

(ui/defcomp app []
  [ui/center
    [ui/column {:gap 20}
     [ui/label {:font-weight :bold
                :font-size 20} "Triangle Area"]
     [ui/label {:font-slant :italic} "Triangle sides:"]
     [gui/label-field "Side a: " *state-a]
     [gui/label-field "Side b: " *state-b]
     [gui/label-field "Side c: " *state-c]
     [ui/label {:font-slant :italic} "Triangle area:"]
     [ui/button {:style :default
       :on-click (fn [_] (reset! *area
         (lg/calc-area (read-string (:text @*state-a))
            (read-string (:text @*state-b))
            (read-string (:text @*state-c)))))}
       [ui/label "Calculate Area"]]
     [ui/label {} (str "Area = " @*area)]]])
  
(defn -main [& args]
  (ui/start-app!
    (win/set-window-size 
      (ui/window
        {:exit-on-close? false}
        #'app) 280 480)))
