(defproject clj-sonar "0.1.0-SNAPSHOT"
  :description "Sample plugin for SonarQube written in Clojure"
  :url "https://github.com/mrijk/clj-sonarqube-plugin"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.sonarsource.sonarqube/sonar-plugin-api, "5.6"]]
  :manifest {"Plugin-Key" "clj-example"
             "Plugin-Class" "clj_sonar.core.ClojurePlugin"
             "Plugin-Name" "My first Clojure Plugin"
             "Plugin-Version" "0.1.0-SNAPSHOT"
             }
  :main clj-sonar.core
  )
