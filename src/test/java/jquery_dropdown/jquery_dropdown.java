package jquery_dropdown;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class jquery_dropdown {
	protected static String url="https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1";
	WebDriver driver=null;
  @Test
  public void f() throws InterruptedException {
	  System.out.println("Title of page :: "+driver.getTitle());
	  WebElement list=driver.findElement(By.xpath("//button[normalize-space()='Open Web Tutorials']"));
	  list.click();
	  WebElement css=driver.findElement(By.cssSelector("a[href='https://www.jquery-az.com/css-tutorials/']"));
	  css.click();
	  WebElement title1=driver.findElement(By.xpath("//h1[@class='page-title']"));
	  System.out.println("Title css : "+title1.getText());
	  if(title1.getText().equals("CSS")) {
		  System.out.println("Yes the page landed correctly.......");
	  }else {
		  System.out.println("No,The page landed in wrong site....");
	  }
	  Thread.sleep(2000);
	  
  }
  @BeforeSuite
  public void beforeSuite() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
