package ObjectReposotory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletingLeads 
{
public DeletingLeads(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

////div//table//tbody//tr[3]//td//input[@type='checkbox']

@FindBy(linkText = "Leads")
private WebElement leadsLink;

@FindBy(xpath ="//div//table//tbody//tr[3]//td//input[@type='checkbox']" )
private WebElement deleteleads;

@FindBy(xpath = "//input[@value='Delete']")
private WebElement deleteIcon;

public WebElement getLeadsLink() {
	return leadsLink;
}

public WebElement getDeleteleads() {
	return deleteleads;
}

public WebElement getDeleteIcon() {
	return deleteIcon;
}


}
