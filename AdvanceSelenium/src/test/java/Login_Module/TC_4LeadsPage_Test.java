package Login_Module;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericLibrary.Base_Class;
import GenericLibrary.ListnersImplementationss;

@Listeners(GenericLibrary.ListnersImplementationss.class)
public class TC_4LeadsPage_Test extends Base_Class
{
@Test
public void ValidatingLeadsPage() throws IOException, InterruptedException
{
//	login1.getUserName().sendKeys(utility.readingdataFromPropertyFile("username"));
//	login1.getUserPassword().sendKeys(utility.readingdataFromPropertyFile("password"));
//	login1.getSubmit().click();
	
	
	
	leads.getLeadsLink().click();
	ListnersImplementationss.logger.log(Status.INFO, "Clicked on leads link");
	
	leads.getCreateLeads().click();
	ListnersImplementationss.logger.log(Status.INFO, "Clicked to create leads");
	
	ut.handlingDropDown(leads.getFirstName(),"Mrs." );
	leads.getLastName().sendKeys("Top V");
	leads.getCompanyName().sendKeys("indiana");
	ut.handlingDropDown(leads.getLeadSourse(), "Self Generated");
	Thread.sleep(2000);
	leads.getAssignedTogroup().click();
	
	ut.handlingDropDown(leads.getAssinedByGroup(), "Team Selling");
	Thread.sleep(2000);
	ListnersImplementationss.logger.log(Status.INFO, "Entered all necessary information to create leads ");
	
	leads.getSaveButton().click();
	ListnersImplementationss.logger.log(Status.INFO, "Clicked on Save button");
	
	
	
}
	
	
}
