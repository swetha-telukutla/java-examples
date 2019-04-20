package Day5;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class SwipeList2 extends Capabilities{
	
	public static Dimension size;

	@Test
	public void testApp() throws InterruptedException
	{
		size=driver.manage().window().getSize();
		System.out.println(size);


		int starty=(int)(size.height*0.80);

		int endy=(int)(size.height*0.20);

		int startx, endx;
		startx=endx=size.width/2;
		//	driver.swipe(startx, starty, endx, endy, duration);
		Thread.sleep(10000);
		// Bottom to top scroll
		driver.swipe(startx, starty, endx, endy, 3000);
          Thread.sleep(5000);
		// Top to Bottom scroll
		driver.swipe(endx, endy, startx, starty, 3000);
	} 

}
