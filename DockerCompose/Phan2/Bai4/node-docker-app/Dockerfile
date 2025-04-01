# Sử dụng hình ảnh node:18 làm base image
FROM node:18

# Thiết lập thư mục làm việc trong container
WORKDIR /usr/src/app

# Sao chép package.json và cài đặt các phụ thuộc
COPY package*.json ./
RUN npm install

# Sao chép toàn bộ mã nguồn vào container
COPY . .

# Expose cổng 3000
EXPOSE 3000

# Lệnh để chạy ứng dụng
CMD ["node", "app.js"]
