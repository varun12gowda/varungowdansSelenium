package ObjectReposotory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 
{
	public LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
 
@FindBy(name = "user_name")
private WebElement userName;

@FindBy(name = "user_password")
private WebElement userPassword;

@FindBy(xpath = "//input[@type='submit']")
private WebElement submit;



public WebElement getSubmit() {
	return submit;
}

public WebElement getUserName() {
	return userName;
}

public WebElement getUserPassword() {
	return userPassword;
}



}
