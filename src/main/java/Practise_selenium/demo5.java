package Practise_selenium;
import java.time.Duration;
//
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.nextgenerationautomation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement signup=driver.findElement(By.cssSelector("div[id='comp-jy04vjt2'] span.YT_9QV"));
		//<span class="YT_9QV" xpath="1">Log In / SignUp</span>
		Thread.sleep(2000);
		signup.click();
		WebElement firstname=driver.findElement(By.name("first-name"));
		firstname.sendKeys("Harini");
		WebElement lastname=driver.findElement(By.name("last-name"));
		lastname.sendKeys("Nachimuthu");
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("harivasanthan37@gmail.com");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("guvi@1234");
		WebElement mobileno=driver.findElement(By.name("enter-mobile number"));
		mobileno.sendKeys("9514248426");
		WebElement city=driver.findElement(By.name("enter-work city"));
		city.sendKeys("Chennai");
		WebElement submit=driver.findElement(By.xpath("//span[normalize-space()='Sign up']"));
		submit.click();
		Thread.sleep(2000);
//		Alert al=driver.switchTo().alert();
//		System.out.println("alert message : "+al.getText());
//		al.accept();
		
	}

}

