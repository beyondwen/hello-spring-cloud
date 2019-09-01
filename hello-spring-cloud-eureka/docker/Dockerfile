FROM openjdk:8-jre

MAINTAINER 921790476@qq.com

ENV DOCKERIZE_VERSION v0.6.1
#RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
#    && tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
#    && rm dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz
RUN mkdir /app

COPY hello-spring-cloud-eureka-0.0.1-SNAPSHOT.jar app/app.jar
#ENTRYPOINT ["dockerize", "-timeout", "5m", "-wait", "tcp://192.168.75.128:8888", "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar", "--spring.profiles.active=prod"]
#ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/home/project/app.jar"]
#
#EXPOSE 8761