package findElements_method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> al = driver.findElements(By.tagName("a"));
		
		for (WebElement a : al) 
		{
			System.out.println(a.getText());
		}
		

	}

}
