package DemoPackage;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(DemoPackage.ITestListners.class)
public class Listeners1

{
	
@Test
public void demoForListener() {
	System.out.println("Testcase 1");
}
@Test
public void demoForListeners1() {
	System.out.println("Testcase 2");
	assertEquals(false, true);
}
}
