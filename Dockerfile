# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/spring-rest-docker-0.0.1-SNAPSHOT.jar /app/spring-rest-docker-0.0.1-SNAPSHOT.jar

# Expose the port the app runs on
EXPOSE 8081

# Define the command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/spring-rest-docker-0.0.1-SNAPSHOT.jar"]