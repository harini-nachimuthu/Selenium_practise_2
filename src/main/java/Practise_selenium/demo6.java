package Practise_selenium;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class demo6 {
	static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name : ");
		String browsername=sc.next().toLowerCase();
		System.out.println("Browser name entered is : "+browsername);
		if(browsername.equals("chrome")) {
			ChromeOptions ops = new ChromeOptions();
            ops.addArguments("--disable-notifications");
            driver = new ChromeDriver(ops);
		}else if(browsername.equals("firefox")) {
			FirefoxOptions ops = new FirefoxOptions();
            ops.addArguments("--disable-notifications");
			driver=new FirefoxDriver(ops);
		}else if(browsername.equals("edge")) {
			EdgeOptions ops = new EdgeOptions();
            ops.addArguments("--disable-notifications");
			driver=new EdgeDriver(ops);
		}else {
			System.out.println("Invalid browser name...");
		}
		browserlaunch(driver);
		//signup(driver);
		newsignup(driver);
	}
	public static void browserlaunch(WebDriver driver) {
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		if(title.contains("Automation Exercise")) {
			System.out.println("Page landed in correct page");
		}else {
			System.out.print("Page not landed in mentioned title");
		}
		String url=driver.getCurrentUrl();
		if(url.contains("https://automationexercise.com/")){
			System.out.println("Yes url is same...");
		}else {
			System.out.println("No url is not same....");
		}
	}
//	public static void signup(WebDriver driver) throws InterruptedException {
//		driver.navigate().to("https://automationexercise.com/");
//		driver.manage().window().maximize();
//		WebElement login=driver.findElement(By.cssSelector("a[href='/login']"));
//		login.click();
//		Thread.sleep(2000);
//	}
	public static void newsignup(WebDriver driver) throws InterruptedException {
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement login=driver.findElement(By.cssSelector("a[href='/login']"));
		login.click();
		Thread.sleep(2000);
		WebElement newsignup=driver.findElement(By.className("signup-form"));
		WebElement name=driver.findElement(By.cssSelector("input[name='name']"));
		name.sendKeys("Harini");
		WebElement email=driver.findElement(By.cssSelector("input[data-qa='signup-email']"));
		email.sendKeys("harivasanthan37@gmail.com");
		WebElement signupclick=driver.findElement(By.cssSelector("button[data-qa=\"signup-button\"]"));
		signupclick.click();
		WebElement acnt_info=driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']"));
		WebElement title_select=driver.findElement(By.cssSelector("div[id='uniform-id_gender1']"));
		title_select.click();
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Guvi@1234");
		WebElement day=driver.findElement(By.id("days"));
		day.sendKeys("7");
		WebElement month = driver.findElement(By.id("months"));
		//Select monthSelect = new Select(month);
		month.sendKeys("November");
		WebElement year=driver.findElement(By.id("years"));
		year.sendKeys("2001");
		WebElement news=driver.findElement(By.cssSelector("input[name='newsletter']"));
		news.click();
		WebElement offer=driver.findElement(By.cssSelector("input[name='optin']"));
		offer.click();
		WebElement first_name=driver.findElement(By.xpath("//input[@id=\"first_name\"]"));
		first_name.sendKeys("Harini");
		WebElement last_name=driver.findElement(By.xpath("//input[@id=\"last_name\"]"));
		last_name.sendKeys("Nachimuthu");
		WebElement Company=driver.findElement(By.xpath("//input[@id=\"company\"]"));
		Company.sendKeys("NA");
		WebElement address=driver.findElement(By.id("address1"));
		address.sendKeys("No-1 Street building");
		WebElement state=driver.findElement(By.id("state"));
		state.sendKeys("Tamil Nadu");
		WebElement city=driver.findElement(By.id("city"));
		city.sendKeys("Chennai");
		WebElement zipcode=driver.findElement(By.id("zipcode"));
		zipcode.sendKeys("600 025");
		WebElement phn_number=driver.findElement(By.id("mobile_number"));
		phn_number.sendKeys("9514248426");
		WebElement create_account=driver.findElement(By.cssSelector("button[data-qa=\"create-account\"]"));
		create_account.click();
		WebElement checking=driver.findElement(By.xpath("//b[normalize-space()='Account Created!']"));
		Thread.sleep(2000);
		String checking1=checking.getText();
		if(checking1.equals("Account Created!")) {
			System.out.println("Yes account has been created");
		}else {
			System.out.println("No,account has not been created");
		}
		WebElement continue_button=driver.findElement(By.xpath("//a[normalize-space()='Continue']"));
		continue_button.click();
		Thread.sleep(2000);
		WebElement log_username=driver.findElement(By.xpath("//header[@id='header']//li[10]"));
		String username1=log_username.getText().trim();
		System.out.println("User logged : "+username1);
		
		if(username1.equalsIgnoreCase("Logged in as Harini")) {
			System.out.println("Yes it Logged in as Harini ");
		}else {
			System.out.print("No it Logged in as Harini " );
		}
		WebElement delete=driver.findElement(By.xpath("//a[normalize-space()='Delete Account']"));
		delete.click();
		Thread.sleep(2000);
		WebElement account_delete=driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']"));
		String deleted=account_delete.getText().trim();
		System.out.println("Account deleted : "+deleted);
		if(deleted.equalsIgnoreCase("Account Deleted!")) {
			System.out.println("Yes account has been deleted");
		}else {
			System.out.println("No account has not deleted");
		}
		
		WebElement account_delete_continue=driver.findElement(By.xpath("//a[normalize-space()='Continue']"));
		account_delete_continue.click();
	}

}


//Question

//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'New User Signup!' is visible
//6. Enter name and email address
//7. Click 'Signup' button
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//9. Fill details: Title, Name, Email, Password, Date of birth
//10. Select checkbox 'Sign up for our newsletter!'
//11. Select checkbox 'Receive special offers from our partners!'
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//13. Click 'Create Account button'
//14. Verify that 'ACCOUNT CREATED!' is visible
//15. Click 'Continue' button
//16. Verify that 'Logged in as username' is visible
//17. Click 'Delete Account' button
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
