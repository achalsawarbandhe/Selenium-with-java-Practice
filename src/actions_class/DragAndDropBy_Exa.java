package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy_Exa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/draggable/");
		
		WebElement d = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(d);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		Actions a= new Actions(driver);
		a.dragAndDropBy(drag, 90, 0);
		a.perform();
	}

}
