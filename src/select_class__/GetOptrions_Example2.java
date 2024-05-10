package select_class__;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptrions_Example2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		
		Select s= new Select(country);
		List<WebElement> allcountry = s.getOptions(); // we are not using getText() here as s.getOptins.text() because getoptions returns multiple id and gettext mehtod can handle only single id or text at a time
		
		for (WebElement web : allcountry) //give elements one after another
		{
			System.out.println(web.getText());
		}

	}


}
