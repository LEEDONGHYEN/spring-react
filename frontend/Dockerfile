# Step 1: Ubuntu 기반 이미지 사용
FROM ubuntu:22.04

# Step 2: 환경 설정 및 Nginx 설치
RUN apt-get update && \
    apt-get install -y nginx && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Step 3: React build 폴더 복사
# frontend/build 폴더가 Dockerfile과 같은 디렉토리에 있어야 함
COPY build/ /var/www/html/

# Step 4: 기본 Nginx 설정 유지 또는 수정 가능
# 기본 설정으로 index.html을 서빙함

# Step 5: 포트 오픈
EXPOSE 80

# Step 6: 컨테이너 시작 시 Nginx 실행
CMD ["nginx", "-g", "daemon off;"]