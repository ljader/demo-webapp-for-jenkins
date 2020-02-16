pipeline {
  agent any

  tools {
    maven 'mvn-3.5.4'
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
