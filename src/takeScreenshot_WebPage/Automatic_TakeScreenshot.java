package takeScreenshot_WebPage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatic_TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		
		 WebDriver driver= new ChromeDriver(); 
		
		driver.get("https://demo.actitime.com/login.do");
		
		TakesScreenshot ts = (TakesScreenshot)driver;    
		
		File tempF = ts.getScreenshotAs(OutputType.FILE);           
		
		File destfile= new File("./deccan/act2.png"); 
		
		FileUtils.copyFile(tempF, destfile); // to move the data from source file to destination file

	}

}
