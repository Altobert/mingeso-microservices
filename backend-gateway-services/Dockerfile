FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} backend-gateway-services-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/backend-gateway-services-0.0.1-SNAPSHOT.jar"]