package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
//		driver.findElement(By.id("toPasswordRecoveryPageLink")).sendKeys(Keys.ENTER);
		
           WebElement us = driver.findElement(By.id("username"));
           
           us.sendKeys("Pune");
           Thread.sleep(2000);
           us.sendKeys(Keys.CONTROL+"a");
           Thread.sleep(2000);
           us.sendKeys(Keys.CONTROL+"c");
           Thread.sleep(2000);
           
           driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"V");
		
	}
}