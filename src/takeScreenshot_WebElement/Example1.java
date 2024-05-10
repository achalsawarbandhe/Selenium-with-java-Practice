package takeScreenshot_WebElement;

import java.awt.Button;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		LocalDateTime ldt = LocalDateTime.now();
		String timestrap= ldt.toString().replace(":","-");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		// Identify the webElement
		WebElement button = driver.findElement(By.name("login"));
		
		//call the method getScreenshot() and store in File form
		File tempFile= button.getScreenshotAs(OutputType.FILE);
		
		//create onject of file and pass absolute path of folder
		File destFile= new File("./achal/Element"+ timestrap+".png"); //concatination
		
		//send screenshot from source file to destination file
		FileUtils.copyFile(tempFile, destFile);
				

	}

}
