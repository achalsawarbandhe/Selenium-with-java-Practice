package javaScriptExecuter_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_On_Desabled {
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver(); 
		driver.get("https://letcode.in/edit");
		WebElement text = driver.findElement(By.id("noEdit"));
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='achal'", text); //stringScript

}
}
