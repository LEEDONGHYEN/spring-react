# Step 1: nginx 이미지 기반
FROM nginx:alpine

# Step 2: React build 결과 복사
COPY build /usr/share/nginx/html

# Step 3: 포트 오픈
EXPOSE 80

# Step 4: 기본 명령어
CMD ["nginx", "-g", "daemon off;"]