package DemoPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AnnotationClass extends BaseClass
{
@Test
public void test1() throws InterruptedException {
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys("king@123");
	driver.findElement(By.id("Password")).sendKeys("989278927");
	driver.findElement(By.className("login-button")).click();
	Thread.sleep(2000);
}
@Test
public void test2() throws InterruptedException {
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys("king@13");
	driver.findElement(By.id("Password")).sendKeys("9898927");
	driver.findElement(By.className("login-button")).click();
	Thread.sleep(2000);
}
}
