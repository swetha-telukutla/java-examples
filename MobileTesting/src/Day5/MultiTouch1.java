package Day5;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

//import Day4.Capabilities;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;

public class MultiTouch1 extends Capabilities{

	/*
	 *  T1= 0.2,0.2
         T2= 0.2,0.8
         T3= 0.8,0.8
         T4= 0.8,0.2
         T5= 0.5,0.5
	 * */

	@Test
	public void testApp()
	{
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		//T1
		int x1=(int)(size.width*0.2);
		int y1=(int)(size.height*0.2);

		//T2
		int x2=(int)(size.width*0.2);
		int y2=(int)(size.height*0.8);

		//T3
		int x3=(int)(size.width*0.8);
		int y3=(int)(size.height*0.8);

		//T4
		int x4=(int)(size.width*0.8);
		int y4=(int)(size.height*0.2);

		//T5
		int x5=(int)(size.width*0.5);
		int y5=(int)(size.height*0.5);
		
		MultiTouchAction maction=new MultiTouchAction(driver);
		
		TouchAction action1=new TouchAction(driver).longPress(x1, y1).waitAction(1500);
		TouchAction action2=new TouchAction(driver).longPress(x2, y2).waitAction(1500);
		TouchAction action3=new TouchAction(driver).longPress(x3, y3).waitAction(1500);
		TouchAction action4=new TouchAction(driver).longPress(x4, y4).waitAction(1500);
		TouchAction action5=new TouchAction(driver).longPress(x5, y5).waitAction(1500);
		
		maction.add(action1).add(action2).add(action3).add(action4).add(action5).perform();
	}

}


