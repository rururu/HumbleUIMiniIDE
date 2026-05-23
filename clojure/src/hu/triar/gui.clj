;; gui.clj
(ns hu.triar.gui
  (:require 
    [io.github.humbleui.ui :as ui]))

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
    

