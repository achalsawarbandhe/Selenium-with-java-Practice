package javaScriptExecuter_package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver(); //upcasting
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
//		jse.executeScript("window.alert('this is alert')");
//		jse.executeScript("window.confirm('this is confirmation')");
		jse.executeScript("window.prompt('this is prompt')");



	}

}
