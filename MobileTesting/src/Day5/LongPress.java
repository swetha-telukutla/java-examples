package Day5;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import io.appium.java_client.TouchAction;

public class LongPress extends  Capabilities{
	@Test
	public void testApp()
	{
		System.out.println("ES File Explorer App get launched..");
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"APP\")").click();
		//		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Xero\")").click();
		WebElement name=  driver.findElementByAndroidUIAutomator("UiSelector().text(\"Xero\")");	
		TouchAction action=new TouchAction(driver);
		//	action.longPress(name).perform();
		action.tap(name).perform();
	}
	

}
