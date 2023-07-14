package GenericLibrary;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListnersImplementationss implements ITestListener
{
	 
		ExtentSparkReporter reporter =new ExtentSparkReporter("./reports/Suite.html");
		ExtentReports report =new ExtentReports();
		
		public static ExtentTest logger;  //to go step by step;
		public void onStart(ITestContext context) {
		report.attachReporter(reporter);//
		}
		public void onTestStart(ITestResult result) {
		logger=report.createTest(result.getMethod().getMethodName());
		}
		public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS, "this test is passed "+result.getMethod().getMethodName());
		}
		
		public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL, "this test is failed "+ result.getMethod().getMethodName());
		try {
		logger.addScreenCaptureFromPath(ScreenShot.takeScreenShot(result.getMethod().getMethodName()));
		}catch (Exception e) {
			e.printStackTrace();
		}}
				
		public void onTestSkipped(ITestResult result) {
		logger.log(Status.SKIP, "this test is skipped "+result.getMethod().getMethodName());
		}
		public void onFinish(ITestContext context) {
		report.flush();
		}
		
}


