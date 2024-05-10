package javaScriptExecuter_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_DefaultAutosuggestion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).click();
		
		List<WebElement> allele = driver.findElements(By.xpath("//li[@role='presentation' and not(@id='YMXe') and not (@id=\"mitGyb\") ]"));
	
	for (WebElement t : allele) {
		System.out.println(t.getText());
		
	}
	}
	

}
