FROM eclipse-temurin:11
COPY build/libs/ejemplo-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","/ejemplo-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
