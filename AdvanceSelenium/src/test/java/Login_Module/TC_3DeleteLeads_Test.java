package Login_Module;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericLibrary.Base_Class;
import GenericLibrary.ListnersImplementationss;
import freemarker.log.Logger;
@Listeners(GenericLibrary.ListnersImplementationss.class)
public class TC_3DeleteLeads_Test extends Base_Class
{
@Test(enabled =true)

public void ValidatingDeleteLeads()
{
	deleteleas.getLeadsLink().click();
	ListnersImplementationss.logger.log(Status.INFO, "Clicked on delete leads");
	deleteleas.getDeleteleads().click();
	ListnersImplementationss.logger.log(Status.INFO, "selected the leads page to delete");
	deleteleas.getDeleteIcon().click();
	ListnersImplementationss.logger.log(Status.INFO, "Clicked on deleted Button");
	 ut.switchToAlert().accept();
	ListnersImplementationss.logger.log(Status.INFO, "clicked on Alert button to accept");
}
}
