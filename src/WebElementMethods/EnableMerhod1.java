package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableMerhod1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.partialLinkText("Edit")).click();
		Thread.sleep(2000);
		
		boolean a = driver.findElement(By.id("noEdit")).isEnabled();  //returns false 
		System.out.println(a);

	}

}
