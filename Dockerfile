FROM openjdk:17

COPY target/spring-boot-todoapp-0.0.1-SNAPSHOT.jar spring-boot-todoapp.jar

ENTRYPOINT ["java", "-jar", "/spring-boot-todoapp.jar"]