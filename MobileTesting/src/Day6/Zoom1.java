package Day6;
import org.testng.annotations.Test;


import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;

public class Zoom1 extends Capabilities{

	@Test
	public void testApp() throws InterruptedException
	{
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Images\")").click();
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"WhatsApp Images(1)\")").click();
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.estrongs.android.pop:id/view\")").click();

		size=driver.manage().window().getSize();

		// T1
		int x1=(int)(size.width*0.30);
		int y1=(int)(size.height*0.30);

		// T2
		int x2=(int)(size.width*0.70);
		int y2=(int)(size.height*0.70);
		
		// For double-tap
		int x3=size.width/2;
		int y3=size.height/2;

		MultiTouchAction maction=new MultiTouchAction(driver);
		TouchAction action1=new TouchAction(driver).longPress(x1+70, y1).waitAction(1500);
		TouchAction action2=new TouchAction(driver).longPress(x2+80, y2).waitAction(1500);
		Thread.sleep(6000);
		maction.add(action1).add(action2).perform();
		
		//driver.zoom(el);
		//driver.pinch(el);

	}

}
