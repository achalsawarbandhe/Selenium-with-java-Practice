package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[]args) {
		
		ChromeDriver d= new ChromeDriver(); //object creation
		
		d.get("https://www.selenium.dev/"); //adding url, if not launched then exception can get 1)illegal arguments and 2)session not created
	
	    d.close(); // use to close single parent window only
//	    d.quit();  // use to close all the window
	}
	

}
