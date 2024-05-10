package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScript_PopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new EdgeDriver()  ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/alert");
		
		//accept()
		/*driver.findElement(By.id("accept")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();*/
		
		//dismiss()
		/*driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();*/
		
		// getText()
		/*driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		String a = driver.switchTo().alert().getText();
		System.out.println(a);*/
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("pune");
		
	}

}
