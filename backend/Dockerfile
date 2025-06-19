FROM registry.access.redhat.com/ubi9/ubi

USER root

RUN dnf -y install java-17-openjdk && dnf clean all

ENV LANG=ko_KR.UTF-8
ENV LANGUAGE=ko_KR:ko
ENV LC_ALL=ko_KR.UTF-8

# 한국 시간으로 설정
RUN ln -sf /usr/share/zoneinfo/Asia/Seoul /etc/localtime && echo "Asia/Seoul" > /etc/timezone


WORKDIR /app
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]


