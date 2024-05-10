package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;

public class JioTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.jio.com/");
		
		driver.findElement(By.linkText("Mobile")).click();  //linktext
		Thread.sleep(2000);
		driver.findElement(By.linkText("True 5G")).click();  //linktext
		Thread.sleep(2000);
		driver.findElement(By.linkText("JioFiber")).click();  //linktext
		Thread.sleep(2000);
		
//	..	driver.findElement(By.linkText("Business")).click();  //Linktext || supports only full text
//	..	driver.findElement(By.linkText("Busine")).click();  //Linktext || won't support parial text
		
		driver.findElement(By.linkText("Busine")).click();  //partiallinktext || supports partial text
	    Thread.sleep(2000);
	    driver.findElement(By.partialLinkText("Shop")).click(); //partialLinkText || supports full text also
	    Thread.sleep(2000);
	    driver.findElement(By.partialLinkText("Ap")).click();  //partialLinkText
	    Thread.sleep(2000);
	    driver.findElement(By.partialLinkText("Support")).click();   //partialLinkText
	    
//	    NOTE : Linktext...supports only Full Text
//	           PartialLinkText.... supports Partial as well as Full Text.
//	           Mostly We are going to use PartialLinkedText because it supports both partial and full Text
		

	}

}
