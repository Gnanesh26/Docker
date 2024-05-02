# Use the official NGINX image as the base image
FROM nginx:latest

# Copy nginx.conf to the container
COPY nginx.conf /etc/nginx/nginx.conf

# Expose ports
EXPOSE 80
