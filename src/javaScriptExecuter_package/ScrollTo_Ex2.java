package javaScriptExecuter_package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo_Ex2 {
		public static void main(String[] args)  {
			// TODO Auto-generated method stub
			
			ChromeDriver driver= new ChromeDriver(); 
//			driver.manage().window().maximize(); //comment this line while performing Horizontal scrolling
			driver.get("https://www.naukri.com/");
			JavascriptExecutor jse= (JavascriptExecutor) driver;
			
			jse.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //top to bottom
			jse.executeScript("window.scrollTo(-0,document.body.scrollHeight)"); // bottom to top
			
//			jse.executeScript("window.scrollTo(document.body.scrollWidth,- 0)");
//			jse.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		}
			

}
