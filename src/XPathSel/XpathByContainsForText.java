package XPathSel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsForText {
	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
//		driver.get("https://demo.actitime.com/login.do");
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click(); //  supports complete text
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Forgot your ')]")).click(); //also supports  partial text 

		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//div[contains(text(),'Grocery')]")).click(); // supports complete text
//		driver.findElement(By.xpath("//div[contains(text(),'Groce')]")).click(); also supports  partial text 
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Mobil')]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		

}
}
