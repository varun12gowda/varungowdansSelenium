 package DemoPackage;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(DemoPackage.ITestListners.class)
public class Listeners3

{
	
@Test
public void demoForListener4() {
	System.out.println("Testcase 5");
}
@Test
public void demoForListeners5() {
	System.out.println("Testcase 6");
	assertEquals(false, true);
}
}
