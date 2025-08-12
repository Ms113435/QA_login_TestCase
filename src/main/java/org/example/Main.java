package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

driver.get("https://practicetestautomation.com/practice-test-login/"); // go to the link
   driver.manage().window().maximize();  // maximize the window from any shape
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
       // driver.findElement(By.xpath("//*[@id=\"submit\"]")).click(); // submit by xpath
        driver.findElement(By.cssSelector("#submit")).click(); //by css selector
        Thread.sleep(2000);
        driver.close(); // block the repeat window
        driver.quit(); // quite the window from continuous
        WebElement message = driver.findElement(By.cssSelector("#submit"));
        //message.getText();
        System.out.println("Result after completing the test case: " + message.getText());



    }
}