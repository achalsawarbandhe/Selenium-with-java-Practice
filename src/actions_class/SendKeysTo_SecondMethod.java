package actions_class;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysTo_SecondMethod {
	
	public static void main(String[]args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement me = driver.findElement(By.id("loginButton"));
		
		Actions a= new Actions(driver);
		a.sendKeys(me, Keys.ENTER);
		a.perform();
		a.build();
	}

}
