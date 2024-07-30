# User Service

User Service - это микросервис, разработанный на Spring Boot, который управляет пользователями. Сервис предоставляет функциональность для регистрации, авторизации, получения информации о пользователе и удаления пользователя.

## Функциональность

- **Регистрация пользователя**: Создание нового пользователя.
- **Авторизация пользователя**: Проверка учетных данных пользователя.
- **Получение информации о пользователе**: Получение данных о конкретном пользователе по его ID.
- **Удаление пользователя**: Удаление пользователя из системы.

## Требования

- Java 8 или выше
- Spring Boot 2.5.4 или выше
- MySQL 5.7 или выше

## Установка

1. **Клонируйте репозиторий**:
    ```sh
    git clone https://github.com/<your-github-username>/user-service.git
    cd user-service
    ```

2. **Создайте файл `application.properties`** в `src/main/resources` и добавьте следующие строки:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/exampleforspring?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
    spring.datasource.username=root
    spring.datasource.password=Whocareswhoami708
    spring.jpa.hibernate.ddl-auto=update
    spring.datasource.initialization-mode=always
    ```

3. **Запустите Docker контейнер с базой данных MySQL**:
    ```yaml
    version: '3.1'

    services:
      db:
        container_name: mysql
        image: mysql:5.7
        environment:
          MYSQL_ROOT_PASSWORD: Whocareswhoami708
          MYSQL_DATABASE: exampleforspring
        ports:
          - "3306:3306"
        volumes:
          - db:/var/lib/mysql

    volumes:
      db:
    ```

4. **Запустите Spring Boot приложение**:
    ```sh
    ./mvnw spring-boot:run
    ```










### README in English

```markdown
# User Service

User Service is a microservice developed with Spring Boot for managing users. The service provides functionalities for user registration, authentication, fetching user details, and deleting users.

## Features

- **User Registration**: Create a new user.
- **User Authentication**: Verify user credentials.
- **Fetch User Details**: Get details of a specific user by their ID.
- **Delete User**: Remove a user from the system.

## Requirements

- Java 8 or higher
- Spring Boot 2.5.4 or higher
- MySQL 5.7 or higher

## Installation

1. **Clone the repository**:
    ```sh
    git clone https://github.com/<your-github-username>/user-service.git
    cd user-service
    ```

2. **Create `application.properties` file** in `src/main/resources` and add the following lines:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/exampleforspring?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
    spring.datasource.username=root
    spring.datasource.password=Whocareswhoami708
    spring.jpa.hibernate.ddl-auto=update
    spring.datasource.initialization-mode=always
    ```

3. **Run Docker container with MySQL database**:
    ```yaml
    version: '3.1'

    services:
      db:
        container_name: mysql
        image: mysql:5.7
        environment:
          MYSQL_ROOT_PASSWORD: Whocareswhoami708
          MYSQL_DATABASE: exampleforspring
        ports:
          - "3306:3306"
        volumes:
          - db:/var/lib/mysql

    volumes:
      db:
    ```

4. **Run the Spring Boot application**:
    ```sh
    ./mvnw spring-boot:run
    ```
