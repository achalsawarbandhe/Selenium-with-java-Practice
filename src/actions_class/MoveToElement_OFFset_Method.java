package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_OFFset_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		WebElement ele = driver.findElement(By.linkText("Pricing"));
		
		Actions a= new Actions(driver);
		a.moveToElement(ele, 100, 0);
		a.perform();
		
		

	}

}
