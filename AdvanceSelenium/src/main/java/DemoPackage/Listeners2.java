package DemoPackage;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(DemoPackage.ITestListners.class)
public class Listeners2

{
	
@Test
public void demoForListener2() {
	System.out.println("Testcase 3");
}
@Test
public void demoForListeners3() {
	System.out.println("Testcase 4");
	assertEquals(false, true);
}
}
