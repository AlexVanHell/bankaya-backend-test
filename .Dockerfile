FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY ./ ./

ARG WAR_FILE=./target/*.war
RUN ./gradlew build
RUN ./gradlew flywayMigrate

RUN cp ${WAR_FILE} app.war

ENTRYPOINT [ "java", "-jar", "/app/app.war" ]