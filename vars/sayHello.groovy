#!/usr/bin/env groovy

 def check(release) {
 
    if (release) {
        sh "mvn clean install"
    } else {
        sh "mvn clean package"
    }
return release
}