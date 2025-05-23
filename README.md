# QA Automation Portfolio - Moqaddas Rahim 🚀

Welcome to my **QA Automation Portfolio**! This curated collection showcases my skills and experience in test automation, utilizing a variety of tools and technologies to ensure software quality across different testing domains. Explore my projects and see how I approach automation challenges.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Moqaddas%20Rahim-blue?logo=linkedin)](https://www.linkedin.com/in/moqaddas-qa-automation)
[![GitHub](https://img.shields.io/badge/GitHub-moqaddasQA-lightgrey?logo=github)](https://github.com/moqaddasQA)

## 📑 Table of Contents

*   [Project Summary](#project-summary)
*   [Portfolio Project Descriptions](#portfolio-project-descriptions)
    *   [1. Maven-Based BDD Automation Framework](#1-maven-based-bdd-automation-framework)
    *   [2. API Testing Suite](#2-api-testing-suite)
    *   [3. SOAP API Testing Project](#3-soap-api-testing-project)
    *   [4. Data-Driven Testing with SQL and TestNG](#4-data-driven-testing-with-sql-and-testng)
    *   [5. Jenkins CI/CD Integration](#5-jenkins-cicd-integration)
    *   [6. Version Control and Agile Tools Demo](#6-version-control-and-agile-tools-demo)
    *   [7. Selenium IDE Demo Project](#7-selenium-ide-demo-project)
    *   [8. WebdriverIO BDD Project](#8-webdriverio-bdd-project)

---

## Project Summary
This portfolio includes a variety of QA automation projects, each designed to demonstrate different testing methodologies and tools. From BDD frameworks to API testing, data-driven testing, CI/CD integration, and more, these projects highlight my skills and experience in ensuring software quality.

---

## 🚀 Portfolio Project Descriptions


### 1. Maven-Based BDD Automation Framework
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)](https://www.selenium.dev/)
[![Cucumber](https://img.shields.io/badge/Cucumber-17A77B?style=for-the-badge&logo=cucumber&logoColor=white)](https://cucumber.io/)

**Project Summary:** This project is a robust, scalable, and maintainable test automation framework designed to test the [OpenCart Demo Website](https://demo.opencart.com/). It leverages **Selenium WebDriver**, **Cucumber**, and **JUnit**, following best practices like the **Page Object Model (POM)** and **Behavior-Driven Development (BDD)**.

- **Features**:

- **Behavior-Driven Development (BDD)**:
  - Write test scenarios in plain English using **Gherkin syntax**.
- **Page Object Model (POM)**:
  - Encapsulates UI elements and actions for better maintainability.
- **Cross-Browser Testing**:
  - Supports Chrome and Firefox (configurable via `config.properties`).
- **CI/CD Ready**:
  - Includes a **Jenkinsfile** for seamless integration with Jenkins pipelines.
- **Detailed Reporting**:
  - Generates HTML and JSON reports for test results.
- **Reusable Utilities**: 
  - Includes utilities for configuration management, WebDriver initialization, and wait strategies.
- **Cross-browser Testing**:
  - Supports testing on Chrome and Firefox browsers.
- **CI/CD Integration**:
  - Integrated with Jenkins for continuous testing and deployment.

---

## 🛠️ Tools & Technologies

| **Tool/Technology** | **Purpose**                                         |
|----------------------|---------------------------------------|
| Selenium WebDriver   | Browser automation                   |
| Cucumber             | BDD framework for writing tests      |
| JUnit                | Test execution                       |
| Maven                | Build and dependency management      |
| Jenkins              | Continuous Integration/Continuous Delivery |
| Apache Commons       | Utility functions                    |
| Java                 | Programming Language                 |
| Gherkin              | Language for BDD scenarios           |
| Page Object Model    | Design pattern for UI testing        |

[![Maven Based BDD Automation Framework](https://github.com/moqaddasQA/Maven-Based-BDD-Automation-Framework/blob/main/ScreenShots/Cucumber_Report.png?raw=true)](https://github.com/moqaddasQA/bdd-automation-framework)

---

## 📂 Project Structure

src
  ├── main
  │   ├── java/com/example
  │   │   ├── pages       # Page classes (e.g., HomePage, LoginPage)
  │   │   ├── utils       # Utility classes (e.g., ConfigReader, DriverFactory)
  │   ├── resources       # Configuration files (e.g., config.properties)
  ├── test
  │   ├── java/com/example
  │   │   ├── features    # Cucumber feature files
  │   │   ├── steps       # Step definitions
  │   │   ├── runners     # Test runner classes
  │   ├── resources       # Test-specific resources

---

## ⚙️ Setup Instructions

Follow these steps to set up and run the project:

### Prerequisites

*   Ensure you have **Java 11** or higher installed.
*   Install **Maven** for dependency management and building the project.
*   Download and install **ChromeDriver** and/or **GeckoDriver** for browser automation with Chrome and Firefox, respectively.
*   (Optional) Install **Jenkins** if you wish to integrate the framework with a CI/CD pipeline.

### 1. Clone the Repository



----

🧪 Running Tests
Run All Tests
mvn test

Run Tests with Specific Tags
mvn test -Dcucumber.filter.tags="@SmokeTest"


View Reports

After running tests, view the HTML report at:

```
target/cucumber-reports.html

```

🖥️ CI/CD Integration
This framework includes a Jenkinsfile for CI/CD pipelines. Follow these steps to integrate with Jenkins:

	1. Create a new Jenkins pipeline.
	2. Point the pipeline to this repository.
	3. Run the pipeline to build, test, and generate reports.

----

📈 Benefits of the Framework
	* Scalable: Easily add new tests and pages.
	* Maintainable: Modular structure with reusable components.
	* Readable: Test scenarios written in plain English.
	* Automated: Fully integrated with CI/CD pipelines.

----

🤝 Contributing
Contributions are welcome! Feel free to:

	* Submit issues or feature requests.
	* Fork the repository and create a pull request.

----

📄 License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

----

# SOAP API Testing Project

## Introduction

This project demonstrates the use of SoapUI to automate the testing of a SOAP-based web service. It focuses on validating the functionality of different web service operations, ensuring they return the expected results. This project highlights SoapUI's capabilities in handling SOAP requests and responses and its use in test automation workflows.

## Features

-   **SOAP Operation Testing:** Automates tests for SOAP web service operations.
-   **Response Validation:** Uses assertions to validate the correctness of SOAP responses.
-   **Test Organization:** Organizes test cases into test suites.
-   **Error Handling:** Includes validation of SOAP faults and error responses.
-   **Clear Documentation:** Provides instructions on setting up the project, running tests, and interpreting results.

## Tools & Technologies

| Tool/Technology | Purpose                                                     |
| --------------- | ----------------------------------------------------------- |
| SoapUI          | Designing, executing, and managing SOAP API tests           |
| Calculator Web Service   | The demo SOAP web service used for testing (`http://www.dneonline.com/calculator.asmx`) |

## Getting Started

### Prerequisites

-   **SoapUI:** Installed and configured on your system.

### Installation

1.  **Open SoapUI**.
2.  **Create a New SoapUI Project**:
    -   Click on `File` -> `New SOAP Project`.
    -   In the `Initial WSDL/WADL` field, enter the WSDL URL: `http://www.dneonline.com/calculator.asmx?wsdl`.
    -   Click `OK`.
3. **Import the WSDL file**
4.  **Create Test Cases:**
    -   Expand the project in the navigator.
    -   Right-click on the web service interface (e.g., `CalculatorSoap`) and select `Generate TestSuite`.
    -   In the `Generate TestSuite` dialog, choose the operations you want to include in your test cases (e.g., `Add`, `Subtract`, `Multiply`, `Divide`) and click `OK`.
5. **Run Test Suite**: 
- Right-click the test suite and select `Run`.
6. **Check Report**: 
- After running the tests, SoapUI will provide detailed reports on the test execution, including the results of each assertion.

## Test Cases

The project includes test cases for the following operations:

-   **`Add`**: Tests the addition operation with different input values and checks the result against the expected value.
-   **`Subtract`**: Tests the subtraction operation with various inputs and compares the result.
-   **`Multiply`**: Tests the multiplication functionality with different input combinations.
-   **`Divide`**: Tests the division operation, including scenarios with valid and invalid inputs (e.g., division by zero).

## Assertions

Each test case includes assertions to validate the SOAP responses. Assertions are used to check:

-   **Response Content**: Verifies that the result matches the expected value.
-   **SOAP Faults**: Ensures that the service returns SOAP faults in case of errors.

## Running Tests

1.  **Select the TestSuite**:
    -   In the navigator, expand your project and the test suite.
2.  **Run the TestSuite**:
    -   Right-click on the test suite and select `Run`.
3.  **View Test Results**:
    -   After running the tests, SoapUI will display the results in the test log, indicating whether each test case has passed or failed.

## Reports

-   **SoapUI Test Reports**: SoapUI provides detailed reports on test executions, including the results of each test case and assertion.
-   **Custom Reports**: You can also customize and create advanced reports using additional reporting libraries if needed.

## Integration in a Test Automation Workflow

SoapUI can be integrated into a larger test automation workflow by:

-   **Command-Line Execution:** Using the command-line runner to execute SoapUI tests as part of a build or deployment pipeline.
-   **Jenkins Integration:** Integrating SoapUI test execution into Jenkins jobs.
-   **Git**:  storing the SoapUi project in the git repository.

## 🤝 Contributing

Contributions are welcome! Feel free to:

	* Submit issues or feature requests.
	* Fork the repository and create a pull request.



## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.



## 📧 Contact

For questions or feedback, feel free to reach out:

	* Name: Moqaddas Rahim
	* Email: moqaddas@example.com
	* LinkedIn: Your LinkedIn Profile



## 🎉 Happy Testing!

# Integrated Personal Portfolio Website

## Introduction

This project is a personal portfolio website designed to showcase a series of QA automation projects. The website includes sections such as "About Me", "Portfolio", and "Contact", featuring a modern design with screenshots and project summaries.

## Features

-   **About Me:** Provides an introduction about the developer, including experience and skills.
-   **Portfolio:** Aggregates and showcases links to GitHub repositories for each project.
-   **Contact:** Includes contact details and links to professional profiles.
-   **Modern Design:** Features a clean and modern design with easy navigation.
- **responsive**: The design is responsive.

## Sections

### About Me

-   **Introduction:** A brief description of the developer and their experience in QA automation.
-   **Skills:** Highlights the developer's key skills and tools.

### Portfolio

-   **Projects List:**
    -   **Project 1: Maven-Based BDD Automation Framework**:
        -   Description: A complete BDD framework targeting https://demo.opencart.com/.
    -   **Project 2: API Testing Suite**:
        -   Description: An API testing project using REST Assured, Postman, and TestNG.
    -   **Project 3: SOAP API Testing Project**:
        -   Description: A project using SoapUI to automate testing of a SOAP-based web service.
    -   **Project 4: Data-Driven Testing with SQL and TestNG**:
        -   Description: A project illustrating data-driven testing by fetching data from a MySQL database.
    -   **Project 5: Jenkins CI/CD Integration**:
        -   Description: A demo project demonstrating how to integrate automated tests with Jenkins.
    -   **Project 6: Version Control and Agile Tools Demo**:
        -   Description: A project demonstrating Git best practices and a simulated Agile process.
    -   **Project 7: Selenium IDE Demo Project**:
        -   Description: A project using Selenium IDE to record and run a quick test.
    -   **WebdriverIO BDD Project**:
        -   Description:  A complete BDD project using Javascript and WebdriverIO.
### Contact


-   **Email:** [moqaddas@example.com](mailto:moqaddas@example.com)
-   **LinkedIn:** [Your LinkedIn Profile](https://www.linkedin.com/in/yourprofile/)

## Getting Started

### Prerequisites

-   A web browser.

### Setup

1.  **Clone the Repository**:
    

## 🤝 Contributing

Contributions are welcome! Feel free to:

	* Submit issues or feature requests.
	* Fork the repository and create a pull request.



## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.



## 📧 Contact


## 🎉 Happy Testing!

# Version Control and Agile Tools Demo

## Introduction

This project demonstrates best practices for version control using Git and GitHub and simulates the use of Agile tools like Jira. It includes examples of common Git workflows and a simple simulation of Jira issue tracking and reporting.

## Features

-   **Git Workflows:** Shows common Git commands and workflows, including branching, merging, and pull requests.
-   **GitHub Collaboration:** Demonstrates the use of GitHub for collaboration and code review.
-   **Simulated Jira Integration:** Provides a simple simulation of Jira issue tracking and reporting.
-   **Clear Documentation:** Includes instructions on running scripts and examples of outputs.

## Tools & Technologies

| Tool/Technology | Purpose                                                      |
| --------------- | ------------------------------------------------------------ |
| Git             | Version control system                                     |
| GitHub          | Git repository hosting service                             |
| Jira (Simulated) | Agile project management and issue tracking (simulated here) |

## Getting Started

### Prerequisites

-   **Git:** Installed and configured.
-   **GitHub:** A GitHub account.

### Setup

1.  **Clone the Repository**:
    
# Data-Driven Testing with SQL and TestNG

## Introduction

This project demonstrates how to perform data-driven testing by fetching test data from a MySQL database. It uses TestNG to execute the tests and JDBC to interact with the database. The project emphasizes validating data integrity and showcasing how to integrate a database with automated tests.

## Features

-   **Database Integration:** Connects to a MySQL database to retrieve test data.
-   **Data-Driven Testing:** Uses TestNG's `@DataProvider` to supply test data from the database to test methods.
-   **Data Validation:** Implements test cases that validate the integrity of the data fetched from the database.
-   **Clear SQL Queries:** Includes well-structured SQL queries for data retrieval and validation.
-   **Comprehensive Reporting:** Leverages TestNG's reporting features to provide detailed test execution reports.

## Tools & Technologies

| Tool/Technology | Purpose                                               |
| --------------- | ----------------------------------------------------- |
| TestNG          | Test execution and reporting                          |
| MySQL           | Database used for storing and retrieving test data  |
| JDBC            | Java API for database connectivity                   |
| Maven           | Build and dependency management                      |

## Getting Started

### Prerequisites

-   **Java:** Version 11 or higher.
-   **Maven:** Installed and configured.
-   **MySQL:** A running MySQL server.
- **MySQL Workbench:** a tool to interact with the MySQL server 

### Database Setup

1.  **Create Database:**
    -   Create a database named `testdb` (or any name of your choice).
2.  **Create Table:**
    -   Create a table named `Products` with the following columns:
        -   `product_id` (INT, PRIMARY KEY)
        -   `name` (VARCHAR(255))
        -   `description` (TEXT)
        -   `price` (DECIMAL(10, 2))
3.  **Insert Sample Data:**
    -   Insert some sample data into the `Products` table.

### Installation

1.  **Clone the Repository**:
    

## 🎉 Happy Testing!
