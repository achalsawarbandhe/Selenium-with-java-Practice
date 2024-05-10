package javaScriptExecuter_package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy_Scrolling_Operation {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver(); 
//		driver.manage().window().maximize(); //comment this line while performing Horizontal scrolling
		driver.get("https://www.naukri.com/");
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		
		//vertical scrolling
//		jse.executeScript("window.scrollBy(0,900)"); //vertical scrolling //scroll up 900px
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,-300)");// scroll down 300px
		
		//horizontal scrollong
		jse.executeScript("window.scrollBy(900,0)"); //vertical scrolling //scroll up 900px
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(-300,0)");
		
		

		
		
	}
		

}
