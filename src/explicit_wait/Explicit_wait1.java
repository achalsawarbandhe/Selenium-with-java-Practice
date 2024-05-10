package explicit_wait;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//object creation webdriverwait class, We are writtingn this line to provide the duration
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedUr="https://demo.actitime.com/login.do";
		
		//Call non static method Until()
		wait.until(ExpectedConditions.urlToBe(expectedUr));
		
		String actualUrl = driver.getCurrentUrl();
		
		
		if(actualUrl.equals(expectedUr))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
		
		System.out.println(actualUrl);

	}

}

