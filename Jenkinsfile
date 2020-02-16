pipeline {
  agent any

  tools {
    maven 'maven-3.3'
    jdk 'jdk8'
  }

  stages {
    stage('Build') {
      steps {
        echo 'Building...'
        bat 'mvn clean package'
      }
    }
  }
}
