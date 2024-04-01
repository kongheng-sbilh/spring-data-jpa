FROM openjdk:21

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} spring_data_jpa.jar

ENTRYPOINT ["java", "-jar", "/spring_data_jpa.jar"]

EXPOSE 8080