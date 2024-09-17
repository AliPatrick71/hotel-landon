# Use an official OpenJDK runtime as the base image
FROM openjdk:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the built Spring Boot jar from the target directory to the container
COPY target/{name-of-the-application.jar} app.jar

# Expose the port that the Spring Boot application runs on
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
