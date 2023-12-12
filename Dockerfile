FROM openjdk:17-slim
LABEL authors="Hugo <hagc2016@gmail.com>"

WORKDIR /monitoring-system

COPY target/edificios-0.0.1-SNAPSHOT.jar /monitoring-system/edificios.jar

EXPOSE 8084

ENTRYPOINT ["java","-jar","edificios.jar"]  