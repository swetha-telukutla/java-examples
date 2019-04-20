import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class Calc1 extends Capabilities {
	@Test
	public void testApp() throws InterruptedException
	{
		driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();  // click on 2
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("plus").click();   // click on plus button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text='4']")).click();   // click on 4
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.android.calculator2:id/eq\")").click();   // click on =
	}

}

