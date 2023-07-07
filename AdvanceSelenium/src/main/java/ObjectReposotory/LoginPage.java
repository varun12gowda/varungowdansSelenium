package ObjectReposotory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
public  LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(id = "Email")
private WebElement EmailTextField;

@FindBy(id = "Password")
private WebElement PasswordTextField;

@FindBy(xpath = "//input[@value='Log in']")
private WebElement LoginButton;

public WebElement getEmailTextField() {
	return EmailTextField;
}

public WebElement getPasswordTextField() {
	return PasswordTextField;
}

public WebElement getLoginButton() {
	return LoginButton;
}


}
