FROM registry.access.redhat.com/ubi9/ubi

USER root

RUN dnf -y install java-17-openjdk && dnf clean all

WORKDIR /app
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]


