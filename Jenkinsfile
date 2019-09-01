pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''pwd
cd hello-spring-cloud-eureka/
/var/jenkins_home/workspace/apache-maven-3.6.1/bin/mvn clean package
cp target/hello-spring-cloud-eureka-0.0.1-SNAPSHOT.jar docker
pwd
cd docker
docker build -t wenhao/test .
'''
      }
    }
    stage('push') {
      steps {
        sh '''docker tag wenhao/test 11.0.0.184:8111/wenhao/wenhao/test
docker login 11.0.0.184:8111 -u admin -p Harbor12345
docker push 11.0.0.184:8111/wenhao/wenhao/test'''
      }
    }
    stage('run') {
      steps {
        sh '''pwd
'''
      }
    }
  }
}