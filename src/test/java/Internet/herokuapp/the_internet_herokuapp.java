package Internet.herokuapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class the_internet_herokuapp {
	protected static String url="http://the-internet.herokuapp.com/";
	
	WebDriver driver=null;
  @Test
  public void f() throws InterruptedException {
	  
  }
  @BeforeSuite
  public void beforeSuite() {
	  WebDriverManager.chromedriver().setup();
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	  
  }
@BeforeClass
public void beforclass() {
	driver.get(url);
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  System.out.println("Currenturl : " +driver.getCurrentUrl());
	  System.out.println("Title : "+driver.getTitle());
	  WebElement digest=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/digest_auth']")));
	  digest.click();
	  String url="http:"+"username"+":"+"password"+"@//the-internet.herokuapp.com/";
	  WebElement text=driver.findElement(By.cssSelector("p"));
	  System.out.println("Text : "+text.getText());
	 
}
  @AfterSuite
  public void afterSuite() {
	  if(driver!=null) {
		  driver.quit();
	  }
  }

}
