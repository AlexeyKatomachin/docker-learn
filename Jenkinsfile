node{
    stage('init'){
      //init sample
    }
    stage('build'){
        withMaven(maven: 'mvn') {
            sh "mvn -B -DskipTests clean package"
        }
    }
}