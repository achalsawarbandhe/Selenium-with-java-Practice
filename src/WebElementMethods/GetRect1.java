package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect1 {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		 Rectangle box = driver.findElement(By.id("keepLoggedInCheckBox")).getRect();
		 
		 
		 System.out.println(box.getX());
		 System.out.println(box.getY());
		 System.out.println(box.getHeight());
		 System.out.println(box.getWidth());
	}
}
