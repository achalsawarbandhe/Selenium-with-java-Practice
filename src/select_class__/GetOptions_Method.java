package select_class__;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement month = driver.findElement(By.id("month"));
		
		Select s= new Select(month);
		List<WebElement> allMonth = s.getOptions(); // we are not using getText() here as s.getOptins.text() because getoptions returns multiple id and gettext mehtod can handle only single id or text at a time
		
		for (WebElement web : allMonth) 
		{
			System.out.println(web.getText());
		}

	}

}
