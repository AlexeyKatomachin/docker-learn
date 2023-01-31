pipeline {
     agent {
         docker {
             image 'maven:3.8.7-eclipse-temurin-11'
             args '-v /root/.m2:/root/.m2'
         }
     }
     stages {
         stage('Build') {
             steps {
                 bat 'mvn -DskipTests clean package'
                 print 'mvn -version'
                 archive 'target*//*.jar'
             }
         }
         stage('Test') {
             steps {
                 echo 'Testing..'
             }
         }
     }
}