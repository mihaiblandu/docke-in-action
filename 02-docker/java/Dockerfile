FROM openjdk:8-jdk-alpine
RUN ls -la
COPY ./build/libs/*.jar app.jar
CMD ["java","-jar","/app.jar"]