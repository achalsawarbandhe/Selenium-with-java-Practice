package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		String a = driver.findElement(By.xpath("//div[text()='Login ']")).getCssValue("border-bottom-left-radius");
		System.out.println(a);
		
		String b = driver.findElement(By.xpath("//div[text()='Login ']")).getCssValue("border-top-color"); // for coloring it will add 1 ie alpha value which shows transferency
		System.out.println(b);

	}

}
