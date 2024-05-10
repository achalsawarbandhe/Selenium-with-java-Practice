package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_2 {
	
	public static void main(String[]args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement b = driver.findElement(By.id("username"));
//		System.out.println(b); // By default Returns false for both the condition because not satiesfying the condition that is tageted element should be radio button or checkbox
		
		if(b.isSelected())
		
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
		
		b.click();
		
		if(b.isSelected())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	

}
