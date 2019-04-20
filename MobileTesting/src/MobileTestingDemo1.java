import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class MobileTestingDemo1 {
	
	public static WebDriver driver;
	@BeforeTest
	public void setUpDriver() throws MalformedURLException
	{		
		DesiredCapabilities capability=new DesiredCapabilities();
		
		// Mobile Address
		capability.setCapability("deviceName", "3004da4ea6998100");
		capability.setCapability("platformName", "Android");
		capability.setCapability("platformVersion", "4.4.2");
		
		// application address (target app)
		capability.setCapability("appPackage", "com.whatsapp");
		capability.setCapability("appActivity", "com.whatsapp.Main");
		
		
		// server address (Appium)
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capability);
	}
	
	
	@Test
	public void testApp()
	{
		driver.findElement(By.id("com.whatsapp:id/eula_accept")).click();
	}
	
	@AfterTest
	public void tearDownDriver() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
}
