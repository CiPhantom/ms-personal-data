FROM openjdk:17-jdk-alpine
RUN apt get install maven
WORKDIR /app
COPY . .
RUN mvn clean install
CMD ["mvn","spring-boot:run"]