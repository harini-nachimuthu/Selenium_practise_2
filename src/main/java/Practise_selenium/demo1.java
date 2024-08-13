package Practise_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver drive=new ChromeDriver();
		drive.navigate().to("https://www.google.com/");
		drive.manage().window().maximize();
		String title=drive.getTitle();
		if(title.equals("Google")) {
			System.out.println("Yes,Given title is same ... ");
		}else {
			System.out.println("No,Given title is not same ... ");
		}
		String url=drive.getCurrentUrl();
		if(url.contains("https://www.google.co.in/")) {
			System.out.println("Yes it has same url ... ");
		}else {
			System.out.println("No url doesn't match ... ");
		}
			
	}

}
