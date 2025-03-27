Basic-Email-Service

📌 Overview

Basic-Email-Service is a Spring Boot application that allows users to send emails using JavaMailSender and Thymeleaf templates. It provides a simple email form where users can enter recipient details, compose an email, and send it using a REST API.

🚀 Features

Send emails using JavaMailSender.

Thymeleaf template integration for dynamic email content.

REST API for sending emails.

Simple HTML form for user input.

🏗️ Technologies Used

Java 17

Spring Boot

Spring Web

Spring Mail (JavaMailSender)

Thymeleaf

Maven

📂 Project Structure

Basic-Email-Service/
│── src/main/java/com/emailservice
│   ├── controller/       # REST Controller & Thymeleaf Controller
│   ├── service/          # Email Sending Service
│   ├── config/           # Email Configuration
│── src/main/resources/
│   ├── templates/        # Thymeleaf HTML templates
│   │   ├── email-form.html
│   ├── application.properties
│── pom.xml               # Maven dependencies
│── README.md

⚙️ Setup Instructions

1️⃣ Clone the Repository

git clone https://github.com/your-username/Basic-Email-Service.git
cd Basic-Email-Service

2️⃣ Configure Email Credentials

Update src/main/resources/application.properties with your SMTP details:

spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-app-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

🔹 Note: Use an App Password instead of your Gmail password.

3️⃣ Build and Run the Application

mvn clean install
mvn spring-boot:run

4️⃣ Open in Browser

Access the email form:

http://localhost:8080/send-email

🔗 API Endpoints

Method

Endpoint

Description

GET

/send-email

Displays the email form

POST

/email/send-html

Sends an email

🎯 Usage

Open http://localhost:8080/send-email.

Enter recipient email, subject, and message.

Click Send Email.

Email will be sent using configured SMTP settings.

📜 License

This project is open-source and available under the MIT License.

🤝 Contributing

Feel free to fork this repository and submit pull requests. Suggestions and improvements are welcome!

📬 Contact

For queries, contact: your-email@example.com

