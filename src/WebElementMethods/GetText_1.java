package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
//		driver.get("https://demo.actitime.com/login.do");
//		driver.manage().window().maximize();
//		
//		String b = driver.findElement(By.id("headerContainer")).getText();
//		System.out.println(b);
		
		driver.get("https://www.facebook.com/");
		String b = driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).getText();
		
		System.out.println(b);
	}

}

