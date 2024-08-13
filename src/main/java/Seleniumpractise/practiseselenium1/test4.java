package Seleniumpractise.practiseselenium1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test4 {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the browser name : ");
		String browser=obj.next().toLowerCase();
		System.out.print(browser);
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}else {
			System.out.println("Entered invalid browser name !! check once....");
		}
		browserlaunch(driver);
		guvisignup(driver);
		guvilogin(driver);
		fontproperties(driver);
		if(driver!=null) {
			driver.quit();
		}
		
		
	}
	
	public static void browserlaunch(WebDriver driver) throws InterruptedException {
		if(driver!=null) {
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			Thread.sleep(4000);
			driver.navigate().to("https://www.guvi.in/");
		}
		else {
			System.out.print("invalid browser name");
		}
	}
	
	public static void guvisignup(WebDriver Driver) {
		try {
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement searchbox=driver.findElement(By.className("gLFyf"));
			searchbox.sendKeys("guvi",Keys.ENTER);
			WebElement guvisearch = driver.findElement(By.cssSelector(".LC20lb.MBeuO.DKV0Md"));
			guvisearch.click();
			WebElement signup=driver.findElement(By.linkText("Sign up"));
			signup.click();
			WebElement name=driver.findElement(By.id("name"));
			name.sendKeys("Harini",Keys.ENTER);
			WebElement email=driver.findElement(By.id("email"));
			email.sendKeys("harini.nachimuthu@gmail.com",Keys.ENTER);
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Harini@246810",Keys.ENTER);
			WebElement mobilenumber=driver.findElement(By.id("mobileNumber"));
			mobilenumber.sendKeys("7550282863",Keys.ENTER);
			WebElement signup1=driver.findElement(By.linkText("Sign Up"));
			signup1.click();
			
			File signupoutput=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(signupoutput, new File("C:\\Users\\harin\\eclipse-workspace\\practiseselenium1\\signupoutput.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void guvilogin(WebDriver driver) throws IOException {
		try {
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement searchbox=driver.findElement(By.name("q"));
			searchbox.sendKeys("guvi login",Keys.ENTER);
//			WebElement login=driver.findElement(By.linkText("Click here to Login"));
//			login.click();
			WebElement guvilogin = driver.findElement(By.cssSelector(".LC20lb.MBeuO.DKV0Md"));
			guvilogin.click();
			WebElement email1=driver.findElement(By.id("email"));
			email1.sendKeys("harini.nachimuthu@gmail.com",Keys.ENTER);
			WebElement password1=driver.findElement(By.id("password"));
			password1.sendKeys("Western@1234",Keys.ENTER);
			
			WebElement login1=driver.findElement(By.linkText("Login"));
			login1.click();
			
			File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file1, new File("C:/Users/harin/eclipse-workspace/practiseselenium1/guvilogin.png"));
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fontproperties(WebDriver driver) {
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("guvi login",Keys.ENTER);
		List<WebElement> fontElements = driver.findElements(By.xpath("//a"));
		System.out.println(fontElements);
        for (WebElement element : fontElements) {
            System.out.println("Text: " + element.getText());
            System.out.println("Size: " + element.getSize());
            System.out.println("Href: " + element.getAttribute("href"));
            System.out.println("Font: " + element.getCssValue("font-family"));
            System.out.println("Color: "+element.getCssValue("color"));
            System.out.println("Font-size: " + element.getCssValue("font-size"));
            System.out.println("Text-align: " + element.getCssValue("text-align"));
        }
	}

}
