package selenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase1 {

	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest Logger;

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Initialize the driver Launch the browser Search web element perform
		 * action
		 */
		System.out.println("start");
		String path = "C:\\Swetha\\JanQaReports\\Report1.html";
		report = new ExtentReports(path);
		Logger = report.startTest("");
		initializeDriver();
		launch("https://login.salesforce.com/");
		WebElement un = findElement(By.xpath(" //input[@id='username']"), "user name");
		enterText(un, "username", "shankarreddy.t-ibof@force.com");
		WebElement passw = findElement(By.xpath("//input[@id='password']"), "passWord");

		System.out.println("password should be empty");
		// Logger.log(LogStatus.PASS, passw + "password should be empty");
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

		login.click();
		 Logger.log(LogStatus.PASS, login + "login clicked");
		 
		Thread.sleep(2000);

		String actual_message = driver.findElement(By.xpath(" //div[@id='error']")).getText();
		String expected_error = "Please enter your password.";

		Assert.assertEquals(actual_message, expected_error);

		System.out.println("pass:" + actual_message);
		Logger.log(LogStatus.PASS, actual_message);
		report.endTest(Logger);
		report.flush();
		System.out.println("end");

	}

	public static void initializeDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SankarA\\Downloads\\chromedriver_win32\\chromedriver.exe ");
		driver = new ChromeDriver();

	}

	public static void launch(String url) {

		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Pass:Salesforce application page is displayed");
		Logger.log(LogStatus.PASS, url + "Salesforce application is displayed");
	}

	/*
	 * Name:enterText Description:Enter the text value in to the text object on
	 * the page. Arguments:ObjectName:Name of the object Textvalue:Value to be
	 * entered Created by:Swetha Creation date:14 Feb 2019 Last modified date:14
	 * Feb 2019
	 */

	public static void enterText(WebElement obj, String objName, String textValue) {
		if (obj == null)

			return;
		if (obj.isDisplayed()) {
			obj.sendKeys(textValue);
			
			System.out.println("Pass: " + objName + " is displyed in the User Name field ");
			Logger.log(LogStatus.PASS, objName + " is displayed in User name field");

		} else {
			Logger.log(LogStatus.FAIL, objName + " could not be found");
			System.out.println("Fail:" + objName + "Plese enter password value");
		}
	}

	/*
	 * find element Description:finding the element in the application
	 * Arguments:ObjectName:name of the object Created by:Swetha Creation
	 * date:14 Feb 2019 Last modified date:14 Feb 2019
	 * 
	 */
	public static WebElement findElement(By location, String objName) {

		WebElement obj = null;
		try {
			obj = driver.findElement(location);
			System.out.println("pass:" + objName+" " + "found on the page");
			Logger.log(LogStatus.PASS, objName + " found on the page");

		} catch (NoSuchElementException errMessage) {
			System.out.println("Fail:" + objName + "not found on the page");
			// Logger.log(LogStatus.FAIL, objName);

		}
		return obj;
	}

}
