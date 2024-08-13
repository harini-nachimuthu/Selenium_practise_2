package techlistic_form;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class techlistic_forrm {
	protected static String url="https://www.techlistic.com/p/selenium-practice-form.html";
	WebDriver driver=null;
  @Test
  public void f() throws InterruptedException {
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	  System.out.println("ooo : "+driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
	  WebElement firstname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
	  firstname.sendKeys("Harini");
	  WebElement lastname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")));
	  lastname.sendKeys("N");
	  WebElement gender=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sex-1")));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);", gender);
	  gender.click();
	  WebElement experience=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exp-0")));
	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
	  js1.executeScript("arguments[0].scrollIntoView(true);",experience);
	  experience.click();
	  Thread.sleep(1000);
	  
  }
  @BeforeSuite
  public void beforeSuite() {
	  WebDriverManager.chromedriver().setup();
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }
@BeforeClass
public void beforclass() {
	driver.get(url);
}
  @AfterSuite
  public void afterSuite() {
	  if(driver!=null) {
		  driver.quit();
	  }
  }

}
