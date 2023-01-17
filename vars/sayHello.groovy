#!/usr/bin/env groovy

def call(Map config = [:]) {
    def release = config.release ?: false

    if (release) {
        sh "mvn clean install"
    } else {
        sh "mvn clean package"
    }
}