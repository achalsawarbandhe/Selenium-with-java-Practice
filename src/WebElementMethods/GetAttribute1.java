package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement us = driver.findElement(By.id("username"));
		
		System.out.println(us.getAttribute("class"));//pass "attribute name" in getAttribute method It will Return attribute value
		
		System.out.println(us.getAttribute("achal")); // Returns Null
		
	    System.out.println(us.getAttribute("value")); // Returns empty List
	    
	    
	    // To check it is empty or not
	    String u = driver.findElement(By.id("value")).getAttribute(null);
	    if(u.isEmpty())
	    {
	    	System.out.println("true");
	    }
	    else
	    {
	    	System.out.println("false");
	    }
	    
	    
	    

	}

}
