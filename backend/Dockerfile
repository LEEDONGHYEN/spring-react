FROM rockylinux:9

USER root

# 필요한 명령어 추가
RUN microdnf install -y java-17-openjdk && microdnf clean all

WORKDIR /app
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]


