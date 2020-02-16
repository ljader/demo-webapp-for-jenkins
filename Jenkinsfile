pipeline {
  agent any

  tools {
    maven 'maven-3.3'
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
