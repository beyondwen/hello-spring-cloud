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
    stage('build') {
      agent any
      steps {
        sh '''pwd
cd hello-spring-cloud-eureka/docker
docker build -t 39.104.50.29:7007/eureka .'''
      }
    }
  }
}