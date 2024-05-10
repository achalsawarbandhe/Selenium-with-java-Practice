package Assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Complete_Bdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select s1= new Select(month);
		s1.selectByVisibleText("Aug");
		
		Select s2= new Select(day);
		s2.selectByVisibleText("31");
		
		Select s3= new Select(year);
		s3.selectByVisibleText("1999");

	}

}

