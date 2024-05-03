# Use official OpenJDK 17 image as the base image
FROM maven:3.8.3-openjdk-17 AS build


# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/docker-0.0.1-SNAPSHOT.jar app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the JAR file
CMD ["java", "-jar", "app.jar"]
