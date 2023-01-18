#!/usr/bin/env groovy

 def call(release, path) {
  if (release) {
   echo "pwd"
        sh "cd ${path} && mvn clean install"
    } else {
        sh "cd ${path} && mvn clean package"
    }

}
