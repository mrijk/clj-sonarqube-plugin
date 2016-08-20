(defproject clj-sonar "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.sonarsource.sonarqube/sonar-plugin-api, "5.6"]]
  :manifest {"Plugin-Key" "clj-example"
             "Plugin-Class" "clj_sonar.core.ClojurePlugin"
             "Plugin-Name" "My first Clojure Plugin"
             "Plugin-Version" "0.1.0-SNAPSHOT"
             }
  :main clj-sonar.core
  )
