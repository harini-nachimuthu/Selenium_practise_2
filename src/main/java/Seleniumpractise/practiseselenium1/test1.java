package Seleniumpractise.practiseselenium1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.demoblaze.com/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver1.findElement(By.linkText("Phones")).click();
		Thread.sleep(1000);
		driver1.findElement(By.linkText("Nexus 6")).click();
		Thread.sleep(1000);
		driver1.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(1000);
		Alert alert1=driver1.switchTo().alert();
		String stralert=alert1.getText();
		System.out.println(stralert);
		alert1.accept();
		driver1.findElement(By.linkText("Cart")).click();
		driver1.findElement(By.xpath("//td[contains(.,'Nexus 6')]"));
		System.out.println("Yes added to cart");
		
	}

}
