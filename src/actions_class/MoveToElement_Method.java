package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_Method{
public static void main(String[]args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	WebElement me = driver.findElement(By.cssSelector("a[data-group='men']"));
	
	Actions a= new Actions(driver);
//	a.contextClick();
	a.moveToElement(me);
	a.perform();
	
	
	
}
}


