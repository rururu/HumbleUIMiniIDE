;; core.clj
(ns hu.triar.core
  (:require 
    [io.github.humbleui.ui :as ui]
    [io.github.humbleui.window :as win]))

(def *state-a
  (ui/signal {:text ""}))

(def *state-b
  (ui/signal {:text ""}))

(def *state-c
  (ui/signal {:text ""}))
  
(def *area (atom 0))
(ui/defcomp app []
  [ui/center
    [ui/column {:gap 20}
     [ui/label {:font-weight :bold
                :font-size 20} "Triangle Area"]
     [ui/label {:font-slant :italic} "Triangle sides:"]
     [ui/row
       [ui/label {:align :center} "Side a: "]
       [ui/size {:width 100} [ui/text-field {:*state *state-a}]]]
     [ui/row
       [ui/label {:align :center} "Side b: "]
       [ui/size {:width 100} [ui/text-field {:*state *state-b}]]]
     [ui/row
       [ui/label {:align :center} "Side c: "]
       [ui/size {:width 100} [ui/text-field {:*state *state-c}]]]
     [ui/button {:on-click (fn[e] (println :QQ))}]
     [ui/label {:font-slant :italic} "Triangle area:"]]])
  
(defn -main [& args]
  (ui/start-app!
    (win/set-window-size 
      (ui/window
        {:exit-on-close? false}
        #'app) 280 480)))
