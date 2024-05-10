package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles__ {
	public static void main(String[]args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> parent=driver.getWindowHandles();
		System.out.println(parent);
	}

}

