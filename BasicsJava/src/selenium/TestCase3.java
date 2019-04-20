package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase3 {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest Logger;

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Initialize the driver Launch the browser Search web element perform
		 * action
		 */
		System.out.println("start");
		String path = "C:\\Swetha\\JanQaReports\\testcase3.html";
		report = new ExtentReports(path);
		Logger = report.startTest("Test the remember checkbox");
		initializeDriver();
		launch("https://login.salesforce.com/");
		WebElement un = findElement(By.xpath(" //input[@id='username']"), "user name");
		enterText(un, "username", "shankarreddy.t-ibof@force.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "passWord");
		enterText(pass, "password", "Reddy@143");

		WebElement remember = driver.findElement(By.cssSelector("#rememberUn"));
		clickCheckBox(remember, "Remember Me");
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

		login.click();
		Logger.log(LogStatus.PASS, login + "Sales force home page is displayed");
WebElement userMenu = driver.findElement(By.id("userNav-arrow"));
		userMenu.click();
		
		
		WebElement logOut = driver.findElement(By.linkText("Logout"));
		logOut.click();
		Logger.log(LogStatus.PASS, logOut + "logout is selected");
		
		WebElement usernametest = driver.findElement(By.xpath("//input[@id='username']"));
		String usertest1 = usernametest.getText();
		Assert.assertEquals(usertest1, un);
		Logger.log(LogStatus.PASS, usernametest + "username is dispalyed in login page");
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
			Logger.log(LogStatus.PASS, objName + " enterd successfully");
		} else {
			Logger.log(LogStatus.FAIL, objName + " could not be found");
			// System.out.println("Fail: " + objName +" " +"could not be
			// found");
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
			Logger.log(LogStatus.PASS, objName + " found on the page");

			// System.out.println("pass: " + objName + "found on the page");
		} catch (NoSuchElementException errMessage) {
			Logger.log(LogStatus.FAIL, objName);
			// System.out.println("Fail:" + objName + "could not be found on the
			// page");

		}
		return obj;
	}

	public static void clickCheckBox(WebElement obj, String objName) {
		if (obj == null)
			return;
		if (obj.isDisplayed()) {
			if (!obj.isSelected()) {
				obj.click();
			}
			Logger.log(LogStatus.PASS, objName);
			// System.out.println("pass: " + objName + "found on the page");
		} else {
			Logger.log(LogStatus.FAIL, objName);
			// System.out.println("Fail:" + objName + "could not be found on the
			// page");

		}

	}
}
