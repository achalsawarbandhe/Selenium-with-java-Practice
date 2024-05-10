package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDesplayed_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		boolean a = driver.findElement(By.id("toPasswordRecoveryPageLink")).isDisplayed(); //returns True
		System.out.println(a);
		
		boolean b = driver.findElement(By.id("toLoginPageLink")).isDisplayed(); //returns False
		System.out.println(b);  

	}

}
