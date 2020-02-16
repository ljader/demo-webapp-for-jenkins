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
        bat 'mvn -B -DskipTests clean package'
      }
    }
    stage('Test') {
      steps {
        bat (script: 'mvn test', label: 'juuuuunit tests')
      }
      post {
        always {
          junit 'target/surefire-reports/*.xml'
        }
      }
    }
    stage('Finalize') {
      steps {
        echo "Using ${env.GLOBAL_TEAMS_URL}"
        office365ConnectorSend color:'green', message:"started ${env.JOB_NAME} ${env.BUILD_NUMBER}", webhookUrl: "${env.GLOBAL_TEAMS_URL}"
      }
    }
  }
}
