package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContexClick_Method {
public static void main(String[]args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement box = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	Actions a= new Actions(driver);
//	a.contextClick();
	a.contextClick(box);
	a.perform();
	
	
	
}
}

