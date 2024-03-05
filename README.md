# Book Management System

Welcome to the Book Management System project! This project is a simple web application built to manage books, authors, and categories, demonstrating CRUD (Create, Read, Update, Delete) operations using Spring Boot and Thymeleaf.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)

## Features

- Allows users to add, view, edit, and delete books.
- Supports managing authors and categories associated with each book.
- Implements authentication and authorization using Spring Security.
- Utilizes Thymeleaf for server-side rendering.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- JDK (Java Development Kit) installed on your machine.
- Maven installed on your machine.
- Git installed on your machine (if you plan to clone the repository).
- MySQL or another relational database installed and configured.

## Installation

To install and run this project locally, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/Book-Management-System.git
   ```

2. Navigate to the project directory:

   ```bash
   cd Book-Management-System
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

## Usage

To use this project:

1. Run the Spring Boot application:

   ```bash
   mvn spring-boot:run
   ```

2. Open your web browser and navigate to `http://localhost:8080/login` to access the login page.
3. Enter your username and password (you can use the predefined users specified in the `SecurityConfig` class).
4. Upon successful login, you will be redirected to the welcome page.
