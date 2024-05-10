package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize1 {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		 WebElement box = driver.findElement(By.id("keepLoggedInCheckBox"));
		 
		 System.out.println(box.getSize());
		 
		 System.out.println(box.getLocation());
		 
		 System.out.println(box.getRect());
		 
		 
		 
		
}
}
