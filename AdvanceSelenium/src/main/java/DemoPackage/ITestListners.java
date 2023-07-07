package DemoPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListners implements ITestListener
{

	public void onTestStart(ITestResult result) {
		System.out.println("Test Starts"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failure"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skip"+result.getName());
		
	}

	

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test ONStarts"+context.getName());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test ONFinish"+context.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
