package GenericLibrary;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.github.dockerjava.api.command.CreateConfigCmd;

import ObjectReposotory.CreateProduct;
import ObjectReposotory.CreatingOrganization;
import ObjectReposotory.DeletingLeads;
import ObjectReposotory.HomePage;
import ObjectReposotory.Leads_page;
import ObjectReposotory.LoginPage;
import ObjectReposotory.LoginPage1;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class Base_Class {

	public static WebDriver driver;
	
	public WebDriver_Utility ut;
	public Properties_Utility utility=new Properties_Utility();
	
	public Excell_Utility Excel;
	public LoginPage login;
	public HomePage home;
	public CreatingOrganization contact;
	public LoginPage1 login1;
	public Leads_page  leads;
	public DeletingLeads deleteleas;
	public SignOut signout;
	public CreateProduct product;
	
	
	
	@BeforeClass(alwaysRun = true)
	public void LaunchBrowser() throws  InterruptedException, IOException {
		if(utility.readingdataFromPropertyFile("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get(utility.readingdataFromPropertyFile("url"));
	
	login1=new LoginPage1(driver);
	login1.getUserName().sendKeys(utility.readingdataFromPropertyFile("username"));
	Thread.sleep(2000);
	login1.getUserPassword().sendKeys(utility.readingdataFromPropertyFile("password"));
	login1.getSubmit().click();
	System.out.println("Application opened");
	
	}
	@BeforeMethod(alwaysRun=true)
	public void navigateToApplication() throws IOException {
		 
		//driver.get(utility.readingdataFromPropertyFile("url"));
		ut=new WebDriver_Utility();
		Excel=new Excell_Utility();
		
		home=new HomePage(driver);
		contact=new CreatingOrganization(driver);
	//	login1=new LoginPage1(driver);
		leads=new Leads_page(driver);
		deleteleas=new DeletingLeads(driver);
		product =new CreateProduct(driver);
		
		
	}
	
	
	
	
	@AfterClass(alwaysRun = true)
	public void tearDownTheBrowser() throws InterruptedException {
		signout =new SignOut(driver);
		
		ut.mouseHoveringOnElement(signout.getSignOutImage());
		Thread.sleep(4000);
		signout.getSignOutButton().click();
		driver.close();
		System.out.println("Application Signed Out and Closed");
	}
}
