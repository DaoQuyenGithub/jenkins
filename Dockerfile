ARG IMAGE_REPO
FROM --platform=linux/amd64 bellsoft/liberica-openjdk-alpine:21
ARG JAR_FILE=target/*.jar
COPY $JAR_FILE /app/app.jar
ARG ENV
ENTRYPOINT exec java -jar /app/app.jar
