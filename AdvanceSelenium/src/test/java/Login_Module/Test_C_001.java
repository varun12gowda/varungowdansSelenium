package Login_Module;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.Base_Class;
@Listeners(GenericLibrary.ListnersImplementationss.class)
public class Test_C_001 extends Base_Class
{
	
@Test(enabled = false)
public void validatingloginModule() throws IOException, InterruptedException
{
	login1.getUserName().sendKeys(utility.readingdataFromPropertyFile("username"));
	login1.getUserPassword().sendKeys(utility.readingdataFromPropertyFile("Password"));
	Thread.sleep(2000);
	login1.getSubmit().click();
	
}

}
