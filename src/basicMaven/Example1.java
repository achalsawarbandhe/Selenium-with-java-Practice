package basicMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement a = driver.findElement(By.id("username"));
		a.sendKeys("achal");
		driver.navigate().refresh(); //when we refresh the page the address of that variable is going to change every time thats why we will get exception 
//		a.clear(); this method will not change the address 
		a.sendKeys("sawarbandhe");
		
		
		

	}

}
