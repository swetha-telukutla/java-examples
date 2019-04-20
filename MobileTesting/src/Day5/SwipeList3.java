package Day5;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import io.appium.java_client.TouchAction;

public class SwipeList3  extends Capabilities{
	
	
		
		@Test
		public void testApp() throws InterruptedException
		{
			Dimension size = driver.manage().window().getSize();
			System.out.println(size);
			int x1=(int)(size.width*0.2);
			int x2=(int)(size.width*0.8);
			WebElement ele1=(WebElement)driver.findElements(By.id("com.fortysevendeg.android.swipelistview:id/front")).get(2);
			WebElement ele2=(WebElement)driver.findElements(By.id("com.fortysevendeg.android.swipelistview:id/back")).get(2);
			TouchAction action=new TouchAction(driver);
			
			// Right to left swipe
			action.longPress(ele1).moveTo(x1, 600).release().perform();
			Thread.sleep(5000);
			// Left to Right swipe
			action.longPress(ele2).moveTo(x2, 600).release().perform();

		}

}
