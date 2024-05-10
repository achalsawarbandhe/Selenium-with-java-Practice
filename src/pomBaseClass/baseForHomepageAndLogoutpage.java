package pomBaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pom.LoginPage;
import pom.HomePage;

public class baseForHomepageAndLogoutpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage hp= new LoginPage(driver);
		hp.login("admin", "manager");
		
		
		HomePage lp= new HomePage(driver);
		lp.logout();
		
		
		
		

	}

}
