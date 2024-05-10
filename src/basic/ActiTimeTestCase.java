package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTestCase {
	public static void main(String[]args) {
		
		ChromeDriver driver= new ChromeDriver();
	
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.linkText("Login")).click();
		
	    driver.findElement(By.partialLinkText("Forgot your ")).click();
		
		System.out.println(driver.getTitle()); 
	
	}

}
