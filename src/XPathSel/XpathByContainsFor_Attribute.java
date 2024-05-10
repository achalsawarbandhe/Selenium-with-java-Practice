package XPathSel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsFor_Attribute {
	public static void main(String[]args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("achalsawarbandhe1999@gmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Password')]")).sendKeys("A");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.cssSelector("div[class='nI-gNb-bar2']")).click();
	}

}
