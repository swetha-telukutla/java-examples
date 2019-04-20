package Day6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import io.appium.java_client.TouchAction;

public class DragNdrop1  extends Capabilities{
	
	
		
		@Test
		public void testApp()
		{
			driver.findElementByAndroidUIAutomator("UiSelector().text(\"Basic usage playground\")").click();
			
			WebElement ele1=(WebElement)driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(2);
			WebElement ele2=(WebElement)driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(4);
			
			TouchAction action=new TouchAction(driver);
			
			action.longPress(ele1).moveTo(ele2).release().perform();
		}

}
