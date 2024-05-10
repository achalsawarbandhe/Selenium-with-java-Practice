package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeTestcase {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("name")).sendKeys("achal sawarbandhe");
		driver.findElement(By.id("email")).sendKeys("achalsawarandhe3@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Achal@1234");
		driver.findElement(By.id("agree")).click();
		driver.findElement(By.xpath("//button[text()='SIGN UP']")).click();
		
		String currTi= driver.getTitle();
		System.out.println(currTi);
		
		String title= "LetCode - Testing Hub" ;
		
		if(currTi.equals(title))
		{
			System.out.println("Test case has been passed");
		}
		else
		{
			System.out.println("Test case has been failed");
		}

	}

}
