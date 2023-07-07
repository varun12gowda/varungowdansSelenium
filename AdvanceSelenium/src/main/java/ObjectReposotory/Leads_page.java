package ObjectReposotory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leads_page {
	
	public  Leads_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/**
	 * PageFactory.initElements() is a method from the Selenium WebDriver library used to initialize the elements of a page object class.

       The \"driver"/ parameter is passed as the argument, which is the instance of WebDriver used to interact with the web page.
      "this" refers to the current instance of the Leads_page class, indicating that the elements should be initialized for this class.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
		@FindBy(linkText = "Leads")
		private WebElement leadsLink;
		
		@FindBy(xpath = "//img[@alt='Create Lead...']")
		private WebElement createLeads;
		
		@FindBy(xpath = "//select[@name='salutationtype']")
		private WebElement firstName;
		
		@FindBy(name  = "lastname")
		private WebElement lastName;
		
		@FindBy(name = "company")
		private WebElement CompanyName;
		
		@FindBy(xpath = "//select[@name='leadsource']")
		private WebElement leadSourse;
		
		@FindBy(xpath = "//input[@value='T']")
		private WebElement assignedTogroup;
		
		@FindBy(xpath = "//select[@name='assigned_group_id']")
		private WebElement assinedByGroup;
		
		
		
		public WebElement getAssinedByGroup() {
			return assinedByGroup;
		}
		@FindBy(xpath = "//input[@title='Save [Alt+S]']")
		private WebElement saveButton;

		public WebElement getLeadsLink() {
			return leadsLink;
		}

		public WebElement getCreateLeads() {
			return createLeads;
		}

		public WebElement getFirstName() {
			return firstName;
		}

		public WebElement getLastName() {
			return lastName;
		}

		public WebElement getCompanyName() {
			return CompanyName;
		}

		public WebElement getLeadSourse() {
			return leadSourse;
		}

		public WebElement getAssignedTogroup() {
			return assignedTogroup;
		}

		public WebElement getSaveButton() {
			return saveButton;
		}
		
		
		
		
		
		

}
