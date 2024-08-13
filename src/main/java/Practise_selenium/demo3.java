package Practise_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.close();
	}

}
