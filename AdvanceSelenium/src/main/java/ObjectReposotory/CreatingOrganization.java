package ObjectReposotory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingOrganization {
	public  CreatingOrganization(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
    }
	@FindBy(linkText = "Contacts")
	private WebElement ContactLink;
	
	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement createContact;
	
	@FindBy(name = "firstname")
	private WebElement FirstName;
	
	@FindBy(name = "lastname")
	private WebElement LastName;
    
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement Save;

	public WebElement getContactLink() {
		return ContactLink;
	}

	public WebElement getCreateContact() {
		return createContact;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getSave() {
		return Save;
	}
	
	
}
