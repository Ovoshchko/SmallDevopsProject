FROM maven:3.8.5-openjdk-18

# Переменные окружения для настройки пользователя и пароля
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=qwerty15112003

COPY . .

RUN mvn clean install

CMD mvn spring-boot:run
