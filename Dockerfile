FROM openjdk:8-jdk-alpine
COPY ./target/aws-devops-service-0.0.1-SNAPSHOT.jar /usr/app
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","/aws-devops-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 8181