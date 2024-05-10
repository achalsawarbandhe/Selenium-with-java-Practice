package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("jdk-8u202-linux-arm32-vfp-hflt.tar.gz")).click();
		driver.findElement(By.xpath("(//div[@class=\"obttns\"])[3]")).isEnabled(); // by Default It will return "True" beause webelement is not satiesfying condition that is Tagname <button> tag or <input> tag.

	}

}
