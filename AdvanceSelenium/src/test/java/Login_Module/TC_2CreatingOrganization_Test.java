package Login_Module;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericLibrary.Base_Class;
import GenericLibrary.ListnersImplementationss;
@Listeners(GenericLibrary.ListnersImplementationss.class)
public class TC_2CreatingOrganization_Test extends Base_Class
{
@Test
public void validatingOrganization() throws InterruptedException, IOException
{
	/**
	login1.getUserName().sendKeys(utility.readingdataFromPropertyFile("username"));
	login1.getUserPassword().sendKeys(utility.readingdataFromPropertyFile("password"));
	login1.getSubmit().click();
	**/
	
	
	
	
	contact.getContactLink().click();
	ListnersImplementationss.logger.log(Status.INFO,"Clicked on contactLink");
	
    // ut.switchToWindows("<"1","2">", "2");
	//assertEquals(false, true);
	contact.getCreateContact().click();
	ListnersImplementationss.logger.log(Status.INFO,"Clicked on Create contact ");
	
	contact.getFirstName().sendKeys("varun");
	ListnersImplementationss.logger.log(Status.INFO,"First Name taken");
	
	contact.getLastName().sendKeys("gowda");
	Thread.sleep(2000);
	contact.getSave().click();
}
	
}
