package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodSubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
//		driver.get("https://demo.actitime.com/login.do");
//		driver.findElement(By.id("keepLoggedInLabel")).submit(); //we will get exception because it not satiesfying the "submit()" condition

	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_5_Lx")).click();
	}

}
