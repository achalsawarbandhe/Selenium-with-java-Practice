package takeScreenshot_WebPage;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class TakeScreenshot_manual_1 {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver(); 
		
		driver.get("https://demo.actitime.com/login.do");
		
		TakesScreenshot ts = (TakesScreenshot)driver;    //down casting  //step 1
		
		File tempF = ts.getScreenshotAs(OutputType.FILE);           // step 2 // getting screenshot //permanent solution
		
		File destfile= new File("./pune/actitime.png");     //permanent location // setting location
		
		tempF.renameTo(destfile); // move the screenshot from temp to destination file
		
		
		
//		System.out.println(tempF.getAbsolutePath());                 //temp solution
//		Thread.sleep(90000);
		
	}

}
