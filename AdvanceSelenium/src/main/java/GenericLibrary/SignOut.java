package GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut {
	public SignOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[contains(@src,'themes/softed/images/user.PNG')]")
	private WebElement signOutImage;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutButton;

	public WebElement getSignOutImage() {
		return signOutImage;
	}

	public WebElement getSignOutButton() {
		return signOutButton;
	}
	
	

}
