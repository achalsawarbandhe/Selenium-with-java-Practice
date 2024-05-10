package takeScreenshot_WebPage;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_screenshot {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(tempfile.getAbsolutePath());
		
		Thread.sleep(9000);
		}

}
