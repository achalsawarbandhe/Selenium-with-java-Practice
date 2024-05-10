package javaScriptExecuter_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Desabled_Ex2 {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver(); 
		driver.get("https://demoapp.skillrary.com/");
		WebElement text = driver.findElement(By.cssSelector("input[class=\"form-control\"]"));
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='sawarbandhe'", text); //stringScript

}

}
