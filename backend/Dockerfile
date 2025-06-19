FROM rockylinux:9

USER root

RUN dnf -y update --setopt=install_weak_deps=False \
 && dnf -y install java-17-openjdk --setopt=install_weak_deps=False \
 && dnf clean all

WORKDIR /app
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]


