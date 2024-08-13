package Seleniumpractise.practiseselenium1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        try {
            // Navigate to Snapdeal
            driver.get("http://snapdeal.com");

            // Click on "Sign In" - ensure this XPath is correct
            WebElement signInLink = driver.findElement(By.xpath("//span[text()='Sign In']"));
            signInLink.click();

            // Wait for the Sign In modal to appear
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));

            // Enter email ID
            emailField.sendKeys("harini.nachimuthu@gmail.com");

            // Click "Continue" button
            WebElement continueButton = driver.findElement(By.xpath("//button[@id='checkUser']"));
            continueButton.click();

            // Wait for the password field to be visible
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));

            // Enter password
            passwordField.sendKeys("your_password_here"); // Replace with your password

            // Click "Login" button
            WebElement loginButton = driver.findElement(By.xpath("//button[@id='login']"));
            loginButton.click();

            // Verify login success - ensure this XPath is correct
            WebElement userProfileElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Welcome']")));
            if (userProfileElement.isDisplayed()) {
                System.out.println("User logged in successfully.");
            } else {
                System.out.println("Login failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
