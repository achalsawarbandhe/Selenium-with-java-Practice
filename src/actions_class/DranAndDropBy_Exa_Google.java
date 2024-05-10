package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class DranAndDropBy_Exa_Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.cssSelector("svg[class='gb_h']")).click();
		driver.switchTo().frame("app");
		
		WebElement b = driver.findElement(By.xpath("//span[text()='YouTube']"));
		
		
		Actions a= new Actions(driver);
		a.click(b);
		a.perform();
		
	}

}
