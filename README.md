# 🚀 Java Playwright Automation Project

This repository contains an automated test framework built using **Java**, **Playwright**, and **Maven**.  
It is designed for fast, reliable, and scalable end-to-end UI test automation Framework.

- **Java 11+**
- **Playwright for Java**
- **TestNG**
- **Maven**
- **Log4j2** for logging
- **Page Object Model (POM)** design
- **Custom Utilities**  
  - ConfigReader  
  - LoggerUtil  
  - TestDataGenerator
 
  git clone https://github.com/sahabajahammed0/VD-Java-playwright


📁 Project Structure
project-root
src
├── main
│ ├── java
│ │ └── com.Weaversweb
│ │ ├── base
│ │ │ └── BasePage.java
│ │ ├── pages
│ │ │ ├── CatagoryManagment.java
│ │ │ ├── ForgotPassword.java
│ │ │ ├── LoginPage.java
│ │ │ ├── MenuPage.java
│ │ │ └── UserManagement.java
│ │ ├── utils
│ │ │ ├── ConfigReader.java
│ │ │ ├── LoggerUtil.java
│ │ │ └── TestDataGenerator.java
│ │ └── debug
│ │ └── LearnPlaywrightInspector.java
│ ├── resources
│ │ ├── config.properties
│ │ └── log4j2.xml
├── test
│ ├── java
│ │ └── Weaversweb
│ │ ├── basetest
│ │ │ └── BaseTest.java
│ │ └── test
│ │ ├── Catagorymanagmnt_Test.java
│ │ ├── LoginTest.java
│ │ ├── TestListener.java
│ │ └── UserManagement_Test.java
