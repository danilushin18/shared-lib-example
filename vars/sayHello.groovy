#!/usr/bin/env groovy

 def check(release) {
  release=release.toBoolean()
    if (release) {
        sh "mvn clean install"
    } else {
        sh "mvn clean package"
    }
}