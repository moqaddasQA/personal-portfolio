# 🛠️ Maven-Based BDD Automation Framework

Welcome to the **BDD Automation Framework**! This project is a robust, scalable, and maintainable test automation framework designed to test the [OpenCart Demo Website](https://demo.opencart.com/). It leverages **Selenium WebDriver**, **Cucumber**, and **JUnit**, following best practices like the **Page Object Model (POM)** and **Behavior-Driven Development (BDD)**.

---

## 🚀 Features

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

---

## 🛠️ Tools & Technologies

| **Tool/Technology** | **Purpose**                          |
|----------------------|--------------------------------------|
| Selenium WebDriver   | Browser automation                  |
| Cucumber             | BDD framework for writing tests     |
| JUnit                | Test execution                      |
| Maven                | Build and dependency management     |
| Jenkins              | Continuous Integration/Delivery     |
| Apache Commons       | Utility functions                   |

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



🛠️ Setup Instructions
Prerequisites
	1. Install Java 11 or higher.
	2. Install Maven.
	3. Install ChromeDriver and/or GeckoDriver (Firefox).
	4. Install Jenkins (optional, for CI/CD).

    
Clone the Repository
git clone https://github.com/your-repo/bdd-automation-framework.git
cd bdd-automation-framework


Install Dependencies
mvn clean install


Update Configuration
Edit the config.properties file in src/main/resources:

browser=chrome
baseUrl=https://demo.opencart.com/
timeout=10

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

📸 Screenshots
Sample Test Report
!Test Report Screenshot

----

🤝 Contributing
Contributions are welcome! Feel free to:

	* Submit issues or feature requests.
	* Fork the repository and create a pull request.

----

📄 License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

----

📧 Contact
For questions or feedback, feel free to reach out:

	* Name: Moqaddas Rahim
	* Email: moqaddas@example.com
	* LinkedIn: Your LinkedIn Profile

----

🎉 Happy Testing!