FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-jenkins-integration-docker-app.jar spring-boot-jenkins-integration-docker-app.jar
ENTRYPOINT [ "java","-jar","/spring-boot-jenkins-integration-docker-app.jar" ]