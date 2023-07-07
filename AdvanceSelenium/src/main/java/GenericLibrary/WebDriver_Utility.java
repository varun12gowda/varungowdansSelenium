package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility extends Base_Class
{
private static final String SSPATH = null;
//// MOUSE ACTIONS


public void dragAndDropDown(WebElement src, WebElement dest) {
	Actions action=new Actions(driver);
	action.dragAndDrop(src, dest).perform();
}
public void rightClick() {
	Actions action=new Actions(driver);
	action.contextClick().perform();
}
	public void doubleTap() {
		Actions action=new Actions(driver);
		action.doubleClick().perform();
	}
	public void mouseHoveringOnElement(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	
////  HANDLING DRODOWNS 
	public Select selectReferences(WebElement dropdown) {
		Select select=new Select(dropdown);
		return select;
	}
	public void handlingDropDown(WebElement dropdown,String value) {
		Select select=new Select(dropdown);
		try
		{
			select.selectByVisibleText(value);
		}
		catch (NoSuchElementException e) {
			select.selectByValue(value);
		}
		}
	public void handlingDropDown(WebElement dropdown,int index) {
		Select select=new Select(dropdown);
		select.selectByIndex(index);
	}
	
///	  JAVASCRIPT EXECUTORS
	public void scrollDownAction(int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public void clickingOnElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	public void enteringDataIntoElement(WebElement element,String data) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value'"+data+"'", element);
	}
	public void clearingDataFromElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=' '", element);
	}

///  SWITCHING TO FRAMES
	public void switchingToFrames(int index) {
		driver.switchTo().frame(index);
	}
	public void switchingToFrames(WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchToFrames(String data) {
		driver.switchTo().frame(data);
	}
	public void switchingBackToMain() {
		driver.switchTo().defaultContent();
	}
	public Alert switchToAlert() {
		Alert alert=driver.switchTo().alert();
			return alert;
	}
	public void switchToWindows(Set<String> allWindowID,String targetWindowTitle) {
		for (String id : allWindowID) {
			driver.switchTo().window(id);
			if(targetWindowTitle.equalsIgnoreCase(driver.getTitle()));
			break;
			}
		
		{
			driver.close();
		}
	}
	public static String takingScreenShots(String screenshotName) {
		TakesScreenshot ss=(TakesScreenshot)driver;
		File photo=ss.getScreenshotAs(OutputType.FILE);
		String idt=LocalDateTime.now().toString().replace(":", "-");
		  
		//File destination=new File(SSPATH+screenShot+" "+idt+", png");
		String path=System.getProperty("user.dir")+SSPATH+screenshotName+""+idt+".png";
		File destination=new File(path);
		try {
			FileUtils.copyFile(photo, destination);
		}catch (IOException e) {
			e.printStackTrace();
		}
		return path; 
	}
}

