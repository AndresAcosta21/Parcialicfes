FROM openjdk:17
COPY ".target/AndresMongo-0.0.1.jar" "app.jar"
EXPOSE 2202
ENTRYPOINT [ "java", "-jar", "app.jar"]