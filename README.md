## OLX Automation Framework – Selenium (POM + PageFactory)
## 📌 Project Overview

This project automates the OLX Search and View Product Details functionality using Selenium WebDriver with Java.

The automation simulates a buyer searching for a used mobile phone on OLX and validating that the product details page loads correctly without login.

The framework is designed using Page Object Model (POM) with Page Factory, making the test scripts maintainable, reusable, and scalable.

## 🎯 Use Case

A user performs the following actions:

Navigate to the OLX homepage

Search for a product (e.g., Used Mobile Phone)

View search results

Select a product from the result grid

Validate the product details page

The automation verifies that the following elements are displayed:

Product Title

Price

Seller Information

Product Description

Product Images

## 🧰 Tools & Technologies Used
Tool	Purpose
Selenium WebDriver	Browser Automation
Java	Programming Language
TestNG	Test Execution Framework
Maven	Build & Dependency Management
Page Object Model	Design Pattern
Page Factory	Web Element Initialization
Extent Reports	HTML Test Reporting
Allure Reports	Advanced Reporting
Log4j / Logger	Logging Test Execution
Git	Version Control
Eclipse / IntelliJ	IDE
## 🏗 Framework Design

The framework follows a layered architecture:

Test Layer → Page Layer → Utilities → WebDriver

TestNG Tests
     ↓
Page Object Classes
     ↓
Utility Classes (Wait, Screenshot, Logger)
     ↓
Selenium WebDriver
## 📁 Project Structure
```
OLX-Automation
│
├── src
│
│ ├── main/java
│ │
│ │ ├── base
│ │ │     └── BaseTest.java
│ │ │
│ │ ├── pages
│ │ │     ├── HomePage.java
│ │ │     ├── SearchResultsPage.java
│ │ │     └── ProductDetailsPage.java
│ │ │
│ │ └── utils
│ │       ├── ScreenshotUtil.java
│ │       ├── WaitUtil.java
│ │       └── LoggerUtil.java
│
│ └── test/java
│       └── tests
│             └── SearchProductTest.java
│
├── screenshots
├── reports
├── testng.xml
├── pom.xml
└── README.md
```
## 🧪 Test Scenario
Test Case ID	Scenario	Expected Result
TC_01	Open OLX Homepage	Page loads successfully
TC_02	Search for product	Search results appear
TC_03	Select product	Product details page opens
TC_04	Validate product details	Title, Price, Description visible
## ⚙ Key Features

✔ Page Object Model (POM) implementation
✔ Page Factory for element initialization
✔ Explicit Waits for dynamic elements
✔ Screenshot capture for verification
✔ Extent Report integration
✔ Allure Report support
✔ Logger for execution tracking
✔ Maven dependency management
✔ Git version control

⚠ Automation Challenges Handled

Dynamic search result loading

Infinite scroll behavior

Delayed image loading

Location-based search variations

Popup handling on homepage

📸 Screenshots

Screenshots of the product details page are automatically captured during test execution and stored in the screenshots/ folder.

📊 Reports

Two reporting tools are integrated:

Extent Reports

Generates detailed HTML reports.

Allure Reports

Provides interactive test reports with execution details.

▶ How to Run the Project
1️⃣ Clone the Repository
git clone https://github.com/yourusername/olx-automation-framework.git
2️⃣ Import Project

Import the project into Eclipse / IntelliJ as a Maven Project

3️⃣ Install Dependencies

Maven will automatically download required dependencies from pom.xml

4️⃣ Run Tests

Run using TestNG

Right Click → testng.xml → Run As → TestNG Suite
