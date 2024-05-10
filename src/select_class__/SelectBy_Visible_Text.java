package select_class__;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBy_Visible_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement month = driver.findElement(By.id("month"));
	
		
		Select s= new Select(month);
		s.selectByVisibleText("Aug");
		
		

	}

}
