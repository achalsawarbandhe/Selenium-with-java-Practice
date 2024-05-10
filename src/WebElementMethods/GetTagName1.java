package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		String fp = driver.findElement(By.xpath("//*[text()='actiTIME 2020 Online']")).getTagName();  //change the element it will return tagname
	    System.out.println(fp);
		

	}

}
