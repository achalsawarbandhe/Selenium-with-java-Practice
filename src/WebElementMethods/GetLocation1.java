package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation1 {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		 Point box = driver.findElement(By.id("keepLoggedInCheckBox")).getLocation();
		 
		 System.out.println(box.getX());
		 System.out.println(box.getY());
	}
}
