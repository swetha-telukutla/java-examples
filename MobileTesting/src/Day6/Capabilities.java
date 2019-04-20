package Day6;


	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.appium.java_client.android.AndroidDriver;

	public class Capabilities {
		
		public static AndroidDriver driver;
		public static Dimension size;
		@BeforeTest
		public void setUpDriver() throws MalformedURLException
		{		
			DesiredCapabilities capability=new DesiredCapabilities();
			
			// Mobile Address
			capability.setCapability("deviceName", "ZX1D642D5H");
			capability.setCapability("platformName", "Android");
			capability.setCapability("platformVersion", "6.0");
			
			// application address (target app)
			capability.setCapability("appPackage", "com.android.chrome");
			capability.setCapability("appActivity", "com.google.android.apps.chrome.Main");
			
			capability.setCapability("browserName", "Chrome");
			
			capability.setCapability("noReset","true");
			// server address (Appium)
			driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capability);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@AfterTest
		public void tearDownDriver() throws InterruptedException
		{
			Thread.sleep(10000);
			driver.quit();
		}
	

}
