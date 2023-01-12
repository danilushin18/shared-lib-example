#!/usr/bin/env groovy

stage('Build'){
  steps {
    def release = false
      if (release) {
       sh 'mvn clean install'
    } else {
       sh 'mvn package'
    }
  }
}
