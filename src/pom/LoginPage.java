package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(name="pwd")
	private WebElement pass;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}
   
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	//create the constructor
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public LoginPage login(String userdata, String passworddata) {
		user.sendKeys(userdata);
		pass.sendKeys(passworddata);
		loginbutton.click();
		return new LoginPage(driver);
	}

}
