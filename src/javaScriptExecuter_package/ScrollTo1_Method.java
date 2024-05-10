package javaScriptExecuter_package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo1_Method{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver(); 
//		driver.manage().window().maximize(); //comment this line while performing Horizontal scrolling
		driver.get("https://www.naukri.com/");
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		
		//vertical scrolling
//		jse.executeScript("window.scrollTo(0,900)"); //vertical scrolling //scroll up 900px
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollTo(0,-300)");// scroll down 300px
		
		//horizontal scrollong
		jse.executeScript("window.scrollTo(500,0)"); //vertical scrolling //scroll up 900px
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(-100,0)");
		
		

		
		
	}
}
