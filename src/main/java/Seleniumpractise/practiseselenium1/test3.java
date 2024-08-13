package Seleniumpractise.practiseselenium1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			WebDriver drive=new ChromeDriver();
			drive.get("http://www.google.com");
			drive.manage().window().maximize();
			drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement searchbox=drive.findElement(By.className("gLFyf"));
			searchbox.sendKeys("guvi",Keys.ENTER);
			WebElement guvisearch = drive.findElement(By.cssSelector(".LC20lb.MBeuO.DKV0Md"));
			guvisearch.click();
			WebElement signup=drive.findElement(By.linkText("Sign up"));
			signup.click();
			WebElement name=drive.findElement(By.id("name"));
			name.sendKeys("Harini",Keys.ENTER);
			WebElement email=drive.findElement(By.id("email"));
			email.sendKeys("harini.nachimuthu@gmail.com",Keys.ENTER);
			WebElement password=drive.findElement(By.id("password"));
			password.sendKeys("Harini@246810",Keys.ENTER);
			WebElement mobilenumber=drive.findElement(By.id("mobileNumber"));
			mobilenumber.sendKeys("7550282863",Keys.ENTER);
			WebElement signup1=drive.findElement(By.linkText("Sign Up"));
			signup1.click();
			
			WebElement login=drive.findElement(By.linkText("Click here to Login"));
			login.click();
			WebElement email1=drive.findElement(By.id("email"));
			email1.sendKeys("harini.nachimuthu@gmail.com",Keys.ENTER);
			WebElement password1=drive.findElement(By.id("password"));
			password1.sendKeys("Western@1234",Keys.ENTER);
			
			WebElement login1=drive.findElement(By.linkText("Login"));
			login1.click();
			
			File file1 = ((TakesScreenshot) drive).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file1, new File("C:/Users/harin/eclipse-workspace/practiseselenium1/ss1.png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
	}

}
