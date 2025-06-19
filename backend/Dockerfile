FROM rockylinux:9

RUN dnf -y update && dnf -y install java-17-openjdk

WORKDIR /app
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]


