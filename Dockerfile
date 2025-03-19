# Use OpenJDK 17 as base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the JAR file
COPY target/Ecommerce-multi-vendor-0.0.1-SNAPSHOT.jar app.jar

# Expose your application port (you're using 5454 in your app)
EXPOSE 5454

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]