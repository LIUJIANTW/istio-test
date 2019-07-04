FROM openjdk:8

COPY build/libs/demo-0.0.1-SNAPSHOT.jar  /app/demo-0.0.1-SNAPSHOT.jar


RUN useradd developer
USER developer
WORKDIR /app/

ENTRYPOINT ["java", "-jar","/app/demo-0.0.1-SNAPSHOT.jar"]