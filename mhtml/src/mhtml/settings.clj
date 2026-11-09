(in-ns 'mhtml.settings)

(ns mhtml.settings
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]))

(def settings-file "./settings.edn")

(def settings
  (with-open [r (io/reader settings-file)]
    (edn/read (java.io.PushbackReader. r))))

