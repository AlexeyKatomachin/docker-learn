pipeline {
    agent any
    tools {
        maven 'Maven_3.8.7'
      }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}
