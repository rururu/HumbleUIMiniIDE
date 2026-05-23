;; core.clj
(ns hu.triar.core
  (:require 
    [io.github.humbleui.ui :as ui]
    [io.github.humbleui.window :as win]
    [io.github.humbleui.signal :as sig]
    [hu.triar.gui :as gui]
    [ru.triar.logic :as lg]))

(def *state-a
  (ui/signal {:text ""}))

(def *state-b
  (ui/signal {:text ""}))

(def *state-c
  (ui/signal {:text ""}))
  
(def *area 
  (ui/signal {:text ""}))

(ui/defcomp app []
  [ui/center
    [ui/column {:gap 20}
     [gui/header1 "Triangle Area"]
     [gui/header2 "Triangle sides:"]
     [gui/label-field "Side a: " *state-a]
     [gui/label-field "Side b: " *state-b]
     [gui/label-field "Side c: " *state-c]
     [gui/header2 "Triangle Area"]
     [ui/button {:style :default
       :on-click (fn[e] (sig/reset! *area
         (lg/calc-area 
            (read-string (@*state-a :text))
            (read-string (@*state-b :text))
            (read-string (@*state-c :text)))))}
       [ui/label "Calculate Area"]]
     [gui/label-state "Area = " @*area]]])



  
(defn -main [& args]
  (ui/start-app!
    (win/set-window-size 
      (ui/window
        {:exit-on-close? false}
        #'app) 280 480)))
