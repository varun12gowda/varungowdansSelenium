package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import DemoPackage.BaseClass;

public class ScreenShot extends Base_Class implements IConstant_Path
{
	public static String takeScreenShot(String screenShot)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String idt=LocalDateTime.now().toString().replace(':','-');
		String path=System.getProperty("usre.dir")+SSPATH+screenShot+""+idt+".png";
		File dest=new File(path);
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}

}
