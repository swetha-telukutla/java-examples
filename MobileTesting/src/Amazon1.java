import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
public class Amazon1 {
	
	
		public static WebDriver driver;
		@BeforeTest
		public void setUpDriver() throws MalformedURLException
		{		
			DesiredCapabilities capability=new DesiredCapabilities();

			File app=new File("C:\\Users\\Selenium\\Desktop\\appium\\app\\Android-apps\\in.amazon.mShop.android.shopping.apk");
			// Mobile Address
			capability.setCapability("deviceName", "3004da4ea6998100");
			capability.setCapability("platformName", "Android");
			capability.setCapability("platformVersion", "4.4.2");
			
			capability.setCapability("app", app.getAbsolutePath());
			
			capability.setCapability("noReset", "true");

			// application address (target app)
			capability.setCapability("appPackage", "com.amazon.mShop.android.shopping");
			capability.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");


			// server address (Appium)
			driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capability);
		}


		@Test
		public void testApp()
		{
			//	driver.findElement(By.id("com.whatsapp:id/eula_accept")).click();
		}

		@AfterTest
		public void tearDownDriver() throws InterruptedException
		{
			Thread.sleep(15000);
			driver.quit();
		}


	}

