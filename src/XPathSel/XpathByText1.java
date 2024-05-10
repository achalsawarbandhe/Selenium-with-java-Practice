package XPathSel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText1 {
	public static void main(String[]args) throws InterruptedException{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.jio.com/");
//		driver.findElement(By.xpath("//a[text()='Mobile']")).click();  //'attribute by text' for link
		
	driver.get("https://letcode.in/test");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.name("email")).sendKeys("achalsawarandhe3@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Achal@1234");
	driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Explore Workspace")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Edit")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("fullName")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("fullName")).sendKeys("Achal sawarabandhe");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Sign out")).click();
	
}
}
