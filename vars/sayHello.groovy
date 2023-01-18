#!/usr/bin/env groovy

 def call(release, path) {
   sh "cd $path"
  if (release) {
        sh "mvn clean install"
    } else {
        sh "mvn clean package"
    }

}
