

	import org.openqa.selenium.By;
	import org.testng.annotations.Test;

	import io.appium.java_client.android.AndroidKeyCode;

	

public class Amazon2 extends Capabilities {
	
		@Test
		public void testApp() throws InterruptedException
		{
			System.out.println("Amazon App launched");
			driver.findElement(By.id("in.amazon.mShop.android.shopping:id/search_edit_text")).click();
			//	driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text")).sendKeys("iPhone X"+"\n");
			driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text")).sendKeys("iPhone X");
			driver.pressKeyCode(AndroidKeyCode.ENTER);
			
			driver.findElementByAndroidUIAutomator("UiSelector().text(\"Apple iPhone X (64GB) - Silver\")").click();
			Thread.sleep(3000);
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
			
		}

	}


