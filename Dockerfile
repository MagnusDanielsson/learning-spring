FROM adoptopenjdk/openjdk11

EXPOSE 8080

COPY target/learning-spring-0.0.1-SNAPSHOT.jar learning-spring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "learning-spring-0.0.1-SNAPSHOT.jar"]
