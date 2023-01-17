#!/usr/bin/env groovy

 def call(release) {
 
    if (release) {
        sh "mvn clean install"
    } else {
        sh "mvn clean package"
    }

}