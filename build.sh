#!/bin/bash

lein clean && lein compile && lein uberjar

docker cp target/clj-sonar-0.1.0-SNAPSHOT-standalone.jar \
       sonarqube:/opt/sonarqube/extensions/plugins

curl -XPOST -u admin:admin http://localhost:9000/api/system/restart
