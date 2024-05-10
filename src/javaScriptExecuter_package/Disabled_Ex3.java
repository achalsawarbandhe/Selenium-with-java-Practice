package javaScriptExecuter_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_Ex3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
		
		
		
		driver.findElement(By.linkText(" jdk-8u202-linux-arm32-vfp-hflt.tar.gz")).click();
		
		
		
		WebElement button = driver.findElement(By.linkText("(Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz"));
		
				
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].click()", button);
		

	}

}

