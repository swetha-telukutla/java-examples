import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
public class Capabilities {

	public static AndroidDriver driver;
	@BeforeTest
	public void setUpDriver() throws MalformedURLException
	{		
		DesiredCapabilities capability=new DesiredCapabilities();
		
		// Mobile Address
		capability.setCapability("deviceName", "3004da4ea6998100");
		capability.setCapability("platformName", "Android");
		capability.setCapability("platformVersion", "4.4.2");
		
		// application address (target app)
		capability.setCapability("appPackage", "com.android.calculator2");
		capability.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		// server address (Appium)
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capability);
	}
	
	@AfterTest
	public void tearDownDriver() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.quit();
	}



}
