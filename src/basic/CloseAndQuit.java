package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
	public static void main(String[]args) {
		
		ChromeDriver d= new ChromeDriver();
		
		d.get("https://www.hyrtutorials.com/p/window-handles-practice.html"); 
	
	    d.findElement(By.id("newWindowBtn")).click();
	    
	    d.quit();
	    d.close();
	}
	

}
