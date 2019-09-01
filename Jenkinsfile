pipeline {
  agent none
  stages {
    stage('package') {
      steps {
        sh '''cd hello-spring-cloud-dependencies/
pwd
/var/jenkins_home/workspace/apache-maven-3.6.1/bin/mvn clean
cd ..
cd hello-spring-cloud-eureka/
/var/jenkins_home/workspace/apache-maven-3.6.1/bin/mvn clean package'''
      }
    }
  }
}