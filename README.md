# clj-sonarqube-plugin
Sample plugin for SonarQube written in Clojure.

It is tested with a Docker image of SonarQube 6.0.

docker pull sonarqube

docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube

To build and install the plugin:

./build.sh


