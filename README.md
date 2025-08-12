markdown
# 🖥️ Selenium Login Automation Test

This project automates a **login test case** for  
[`https://practicetestautomation.com/practice-test-login/`](https://practicetestautomation.com/practice-test-login/)  
using **Java 21**, **Selenium WebDriver 4.34.0**, and **Maven**.



## 📌 What It Does
- Opens the Chrome browser
- Navigates to the test login page
- Enter the username and password
- Clicks the submit button
- Retrieves and prints the result message
- Closes and quits the browser



## 📂 Project Structure



Test/
│
├── src/
│   └── main/java/org/example/Main.java   # Main Selenium automation code
│
├── pom.xml                               # Maven dependencies & build config
└── README.md                             # Project documentation





## 🛠️ Prerequisites

- **Java JDK 21** or later  
  ```bash
  java -version
````

* **Apache Maven** installed and on PATH

  ```bash
  mvn -v
  ```

* **Google Chrome** browser installed

* **ChromeDriver** handled automatically by Selenium Manager (from Selenium 4.6+)

---

## 📦 Installation & Setup

1. **Clone this repository**

   ```bash
   git clone https://github.com/yourusername/selenium-login-test.git
   cd selenium-login-test
   ```

2. **Install dependencies**

   ```bash
   mvn clean install
   ```

---

## 🚀 Running the Test

Run the `Main` class from your IDE,
or from the command line:

```bash
mvn exec:java -Dexec.mainClass="org.example.Main"
```

---

## ⚙️ `pom.xml` Highlights

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.34.0</version>
</dependency>
<!-- selenium-manager is optional; included here explicitly -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-manager</artifactId>
    <version>4.34.0</version>
</dependency>
```

---

## 🧠 Notes

* `Thread.sleep(2000)` is used for demo delay;
  for real tests, consider `WebDriverWait` for better reliability.
* You can replace selectors (`By.id`, `By.cssSelector`)
  to match your site’s structure.
* `driver.close()` closes the current window;
  `driver.quit()` ends the WebDriver session completely.

