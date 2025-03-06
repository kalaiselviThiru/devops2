FROM openjdk:17
WORKDIR /app
COPY target/simple-java-app-1.0-SNAPSHOT.jar simple-java-app.jar
ENTRYPOINT ["java", "-cp", "simple-java-app.jar", "com.example.Calculator"]
