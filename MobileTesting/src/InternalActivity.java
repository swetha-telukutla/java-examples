import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class InternalActivity extends Capabilities {
	@Test
	public void testApp() throws InterruptedException
	{
		driver.findElement(By.id("com.android.contacts:id/floating_action_button")).click();
		
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Name\")").sendKeys("Jan22");
		driver.hideKeyboard();   // To hide Keyboard
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Phone\")").sendKeys("12345");
		driver.findElement(By.id("com.android.contacts:id/menu_save")).click();
		driver.findElementByAccessibilityId("Text 12345").click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.mms:id/embedded_text_editor")).sendKeys("Hello Team");
	}
	
	}
