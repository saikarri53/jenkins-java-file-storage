FROM openjdk:11-jre-slim
COPY target/file-storage-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
