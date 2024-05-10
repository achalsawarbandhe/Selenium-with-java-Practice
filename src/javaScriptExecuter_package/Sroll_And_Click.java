package javaScriptExecuter_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sroll_And_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		
		for(; ;) {
			try {
		
		driver.findElement(By.partialLinkText("International Women's Day 2023")).click();
			}
		catch(NoSuchElementException a)
			{
			 jse.executeScript("window.scrollBy(0,800)");
			}
		}

	}

}
