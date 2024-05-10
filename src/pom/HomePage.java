package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(id="logoutLink")
	private WebElement logotbutton;

	public WebElement getLogotbutton() {
		return logotbutton;
	}

	public HomePage(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
		
	}
	public LoginPage logout()
	{
		logotbutton.click();
		return new LoginPage(driver);
	}
	
	
	

}
