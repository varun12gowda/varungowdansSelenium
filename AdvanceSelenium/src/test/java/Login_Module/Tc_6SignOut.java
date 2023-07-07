package Login_Module;

import org.testng.annotations.Test;

import GenericLibrary.Base_Class;
import GenericLibrary.SignOut;

public class Tc_6SignOut extends Base_Class
{
@Test(enabled = false)
public void ValidatingSignOutPage() 
{
	ut.mouseHoveringOnElement(signout.getSignOutImage());
	
	signout.getSignOutButton().click();
}
}
