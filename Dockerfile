# Stage 1: Build the JAR
FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the app
FROM openjdk:17
WORKDIR /app
COPY --from=builder /app/target/Ecommerce-multi-vendor-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 5454
ENTRYPOINT ["java", "-jar", "app.jar"]
