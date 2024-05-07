#A Dockerfile is a text document that contains instructions for building a Docker image.


# Use official OpenJDK 17 image as the base image
FROM maven:3.8.3-openjdk-17 AS build


# Set the working directory inside the container
WORKDIR /app
#WORKDIR /app: Sets the working directory inside the container to /app. This is where subsequent commands will be executed.

# Build the JAR file
RUN mvn clean package

# Copy the JAR file into the container at /app
COPY target/docker-0.0.1-SNAPSHOT.jar app.jar
#COPY target/docker-0.0.1-SNAPSHOT.jar app.jar: Copies the JAR file named docker-0.0.1-SNAPSHOT.jar
 #from the target directory of the host machine into the /app directory inside the container. It also renames the JAR file to app.jar inside the container.

# Make port 8080 available to the world outside this container
EXPOSE 8080
#EXPOSE 8080: Informs Docker that the container will listen on port 8080 at runtime.
#This does not actually publish the port, but it documents which ports the container is intended to use.

# Run the JAR file
CMD ["java", "-jar", "app.jar"]