package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected1 {
	public static void main(String[]args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		 WebElement box = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		 if(box.isSelected())
		 {
			 System.out.println("True");
		 }
		 else
		 {
			 System.out.println("False");
		 }
		 
		 box.click();
		 if(box.isSelected())
		 {
			 System.out.println("True");
		 }
		 else
		 {
			 System.out.println("False");
		 }
	}

}
