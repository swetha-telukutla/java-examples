package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase4B {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest Logger;

	public static void main(String[] args) throws InterruptedException {

		System.out.println("start");
		String path = "C:\\Swetha\\JanQaReports\\Testcase4B.html";
		report = new ExtentReports(path);
		Logger = report.startTest("");
		initializeDriver();
		launch("https://login.salesforce.com/");
		WebElement un = findElement(By.xpath(" //input[@id='username']"), "user name");
		enterText(un, "username", "123@gmail.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "passWord");
		enterText(pass, "password", "Dummy");

		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

		login.click();
		System.out.println("Pass:Error message should be displayed");
		Logger.log(LogStatus.PASS, login + "error message should be displayed");

		Thread.sleep(2000);
		driver.quit();
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
		System.out.println("SFDC login page is opened");
		Logger.log(LogStatus.PASS, "SFDC login  page is opened");
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

			System.out.println("Pass: " + objName + " wrong value entered ");
			Logger.log(LogStatus.PASS,objName + " wrong enterd ");
		} else {
			Logger.log(LogStatus.FAIL, objName + " could not be found");
			System.out.println("Fail:" + objName + "could not found on the page");
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
			System.out.println("pass:" + objName + "found on the page");
			Logger.log(LogStatus.PASS, objName + " found on the page");

		} catch (NoSuchElementException errMessage) {
			System.out.println("Fail:" + objName + "not found on the page");
			// Logger.log(LogStatus.FAIL, objName);

		}
		return obj;
	}

}
