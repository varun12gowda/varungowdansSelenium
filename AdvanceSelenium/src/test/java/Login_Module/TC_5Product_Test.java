package Login_Module;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericLibrary.Base_Class;
import GenericLibrary.ListnersImplementationss;
@Listeners(GenericLibrary.ListnersImplementationss.class)
public class TC_5Product_Test extends Base_Class
{
	@Test
public void ValidatingProducts() throws IOException, InterruptedException {
	product.getProductLink().click();
	ListnersImplementationss.logger.log(Status.INFO, "Clicked on Product Link");
	
	product.getProductButton().click();
	ListnersImplementationss.logger.log(Status.INFO, "Clicked on add products");
	
	product.getProductName().sendKeys(utility.readingdataFromPropertyFile("ProductName"));
	Thread.sleep(2000);
	ut.handlingDropDown(product.getProductCategory(),utility.readingdataFromPropertyFile("ProductCategory"));
	product.getProductStartDate().sendKeys(utility.readingdataFromPropertyFile("SalesStartDate"));
	Thread.sleep(2000);
	//product.getProductEndDate().sendKeys(utility.readingdataFromPropertyFile("SalesEndDate"));
	//Thread.sleep(2000);
	product.getVenderPartNo().sendKeys(utility.readingdataFromPropertyFile("VendorPartNo"));
	Thread.sleep(2000);
	product.getProductSheet().sendKeys(utility.readingdataFromPropertyFile("ProductSheet"));
	Thread.sleep(2000);
	//ut.handlingDropDown(product.getGLAccount(),utility.readingdataFromPropertyFile("GLAccount"));
	//Thread.sleep(2000);
	product.getProductCode().sendKeys(utility.readingdataFromPropertyFile("PartNumber"));
	Thread.sleep(2000);
	ut.handlingDropDown(product.getManufacturer(), utility.readingdataFromPropertyFile("Manufacturer"));
	Thread.sleep(2000);
	product.getSupportStartDate().sendKeys(utility.readingdataFromPropertyFile("SupportStartDate"));
	Thread.sleep(2000);
	product.getSupportEndDate().sendKeys(utility.readingdataFromPropertyFile("SupportExpiryDate"));
	Thread.sleep(2000);
	product.getWebsite().sendKeys(utility.readingdataFromPropertyFile("Website"));
	Thread.sleep(2000);
	product.getMfrPartNumb().sendKeys(utility.readingdataFromPropertyFile("MfrPartNo"));
	Thread.sleep(2000);
	product.getSerialNo().sendKeys(utility.readingdataFromPropertyFile("SerialNo"));
	Thread.sleep(2000);
	product.getUnitPrice().sendKeys(utility.readingdataFromPropertyFile("UnitPrice"));
	Thread.sleep(2000);
	ut.handlingDropDown(product.getUsageUnit(),utility.readingdataFromPropertyFile("UsageUnit"));
	Thread.sleep(2000);
	product.getGroup().click();
	Thread.sleep(2000);
	ut.handlingDropDown(product.getHandlerGroup(),utility.readingdataFromPropertyFile("Handler"));
	Thread.sleep(2000);
	
	product.getDescription().sendKeys(utility.readingdataFromPropertyFile("Description"));
	ListnersImplementationss.logger.log(Status.INFO, "all the necesary credentials taken from property file ");
	
	Thread.sleep(4000);
	Thread.sleep(2000);
	product.getSave().click();
	ListnersImplementationss.logger.log(Status.INFO,"Clicked on Save button");
	
}


}
