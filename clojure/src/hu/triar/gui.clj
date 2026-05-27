;; gui.clj
(ns hu.triar.gui
  (:require 
    [io.github.humbleui.ui :as ui]))

(defn label-field [label state]
  [ui/row
    [ui/label {:align :center} label]
      [ui/size {:width 100} [ui/text-field {:*state state}]]])
      
(defn header1 [txt]
  [ui/label {:font-weight :bold
             :font-size 20} txt])
             
(defn header2 [txt]
  [ui/label {:font-slant :italic} txt])

