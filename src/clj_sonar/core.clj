(ns clj-sonar.core
  (:import org.sonar.api.ce.posttask.PostProjectAnalysisTask)
  (:import org.sonar.api.Plugin)
  (:import org.sonar.api.utils.log.Loggers))

(deftype GateStatus [] PostProjectAnalysisTask
         (finished [this analysis]
           (let [logger (Loggers/get(.getClass this))]
             (.info logger "*** Finished! ***"))))

(deftype ClojurePlugin [] Plugin
         (define [this context]
           (let [logger (Loggers/get(.getClass this))
                 bar (GateStatus.)
                 task (.getClass bar)]
             (.info logger "*** 45 This is amazing! ***")
             (.addExtension context task))))
