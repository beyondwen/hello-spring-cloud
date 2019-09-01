pipeline {
  agent any
  stages {
    stage('package') {
      steps {
        sh '''pwd
cd hello-spring-cloud-eureka/
/var/jenkins_home/workspace/apache-maven-3.6.1/bin/mvn clean package
cp target/hello-spring-cloud-eureka-0.0.1-SNAPSHOT.jar docker'''
      }
    }
  }
}