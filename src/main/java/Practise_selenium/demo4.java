package Practise_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;
import java.util.Scanner;

public class demo4 {
	static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the browser name ? ");
		String user_input=obj.next().toLowerCase();
		
		if(user_input.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(user_input.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if(user_input.equals("internetexplorer")) {
			driver=new InternetExplorerDriver();
		}else {
			System.out.print("user_input doesn't match the browser name.Please, provide browser name properly");
		}
		
		browsedetails(driver);
	}
	public static void browsedetails(WebDriver driver) throws InterruptedException {
		if(driver!=null) {
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			System.out.println("Title : "+driver.getTitle());
			System.out.println("Url : "+driver.getCurrentUrl());
			//System.out.println("PageSource : "+driver.getPageSource());
			Thread.sleep(2000);
			driver.close();
		}
		else {
			System.out.println("Enter valid browser name ...");
		}
	}

}
