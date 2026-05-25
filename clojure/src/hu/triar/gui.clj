;; gui.clj
(ns hu.triar.gui
  (:require 
    [io.github.humbleui.ui :as ui]
    [io.github.humbleui.signal :as sig]))

(defn header1 [txt]
  [ui/label {:font-weight :bold
             :font-size 20} txt])
             
(defn header2 [txt]
  [ui/label {:font-slant :italic
             :font-size 16} txt])
             
(defn label-field [label state]
  [ui/row
    [ui/label {:align :center} label]
    [ui/size {:width 100} [ui/text-field {:*state state}]]])
    
(defn label-state [label state]
  [ui/row
    [ui/label {} label]
    [ui/label state]])
    
(defmacro button-calc-result [label state result-func]
  `[ui/button {:style :default
    :on-click (fn[e] (sig/reset! ~state ~@result-func))}
    [ui/label ~label]])
    
