FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} backend-eureka-services-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/backend-eureka-services-0.0.1-SNAPSHOT.jar"]