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
        sh '''docker tag wenhao/test 39.104.50.29:7007/wenhao/wenhao/test
docker login http://39.104.50.29:7007 --username admin --password Harbor12345
docker push 39.104.50.29:7007/wenhao/wenhao/test'''
      }
    }
  }
}