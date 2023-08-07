# Stage 1: Build the application
FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /app
COPY ./src /app/src
COPY ./pom.xml /app/pom.xml
RUN mvn package

# Stage 2: Create the final image
FROM openjdk:17-alpine
WORKDIR /app
COPY --from=builder /app/target/DemoKedarDemo-0.0.1-SNAPSHOT.jar DemoKedarDemo-0.0.1-SNAPSHOT.jar
EXPOSE 8081
CMD ["java", "-jar", "DemoKedarDemo-0.0.1-SNAPSHOT.jar"]
