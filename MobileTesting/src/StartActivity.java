import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidKeyCode;

public class StartActivity extends Capabilities {
	@Test
	public void testApp() throws InterruptedException
	{
		System.out.println("Amazon App launched");
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/search_edit_text")).click();
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text")).sendKeys("iPhone X");
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		Thread.sleep(4000);
		/*
		 *  To automate 3-party mobile app (android) we can go with "Start Activity" command.
		 * */
		driver.startActivity("com.android.settings", "com.android.settings.Settings");
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Wi-Fi\")").click();
	}

}
