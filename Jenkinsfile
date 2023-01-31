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
                    def pom = readMavenPom file: 'pom.xml'
                    print pom.version
                    junit '**//*target/surefire-reports/TEST-*.xml'
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
}