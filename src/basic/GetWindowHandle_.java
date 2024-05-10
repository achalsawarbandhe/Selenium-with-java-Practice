package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle_ {
	public static void main(String[]args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
	}

}
