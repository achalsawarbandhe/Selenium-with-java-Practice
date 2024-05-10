package explicit_wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		String expectedT= "vtiger";
		
		wait.until(ExpectedConditions.titleIs(expectedT));

		String actualT = driver.getTitle();
		
				if(actualT.equals(expectedT))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		System.out.println(actualT);

	}

}
