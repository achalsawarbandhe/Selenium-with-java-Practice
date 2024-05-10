package synchronization1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeSync1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //implicit waits for 1) findElement() and 2) findElements() method only
        
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));  // PageloadTimeout wait for 1)get() and 2) navigateTo() methods only
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
//		driver.findElement(By.id("logoutLink")).click();
		

	}

}
