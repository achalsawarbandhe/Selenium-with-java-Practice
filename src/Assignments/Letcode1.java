package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode1 {
public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("fullName")).sendKeys("Achal Sawarbandhe");
		driver.findElement(By.id("join")).clear();
		driver.findElement(By.id("join")).sendKeys("Im better");
		
		

}
}
