FROM rockylinux:9

USER root

RUN microdnf install -y java-17-openjdk && microdnf clean all

WORKDIR /app
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]


