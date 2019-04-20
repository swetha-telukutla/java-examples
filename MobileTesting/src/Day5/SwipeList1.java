package Day5;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class SwipeList1 extends Capabilities{

	public static Dimension size;

	@Test
	public void testApp() throws InterruptedException
	{
		size=driver.manage().window().getSize();
		System.out.println(size);


		int startx=(int)(size.width*0.80);

		int endx=(int)(size.width*0.20);

		int starty, endy;
		starty=endy=size.height/2;
		//	driver.swipe(startx, starty, endx, endy, duration);
		Thread.sleep(10000);
		// Right to left swipe
		driver.swipe(startx, starty, endx, endy, 3000);
          Thread.sleep(5000);
		// Left to Right swipe
		driver.swipe(endx, endy, startx, starty, 3000);
	}

}
