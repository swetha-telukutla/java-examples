package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import freemarker.log.Logger;

public class TestCase4A {

	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest Logger;

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Initialize the driver Launch the browser Search web element perform
		 * action
		 */
		System.out.println("start");
		String path = "C:\\Swetha\\JanQaReports\\testcase4A.html";
		report = new ExtentReports(path);
		Logger = report.startTest("Test the forgot password");
		initializeDriver();
		launch("https://login.salesforce.com/");

		
		WebElement forgotpw = driver.findElement(By.xpath("//a[@class='fl small']"));
		forgotpw.click();
		System.out.println("Salesforce forgot password page is displayed");
		Logger.log(LogStatus.PASS, forgotpw + "Salesforce forgot password page is displayed ");

		WebElement un = findElement(By.name("un"), "user name");
		enterText(un, "username", "shankarreddy.t-ibof@force.com");
		//un.click();
		WebElement conti = driver.findElement(By.xpath("//input[@id='continue']"));
		conti.click();
		System.out.println("Password reset message page is displayed.");
		Logger.log(LogStatus.PASS, conti + " Password reset message page is displayed");

		WebElement returntologin = driver.findElement(By.linkText("Return to Login"));
		returntologin.click();
		System.out.println("return to login  page is displayed.");
		Logger.log(LogStatus.PASS, returntologin + " Password reset message page is displayed");
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

	public static void enterText(WebElement obj, String objName, String textValue) {
		if (obj == null)
			return;
		if (obj.isDisplayed()) {
			obj.sendKeys(textValue);

			System.out.println("Pass: " + objName + " is displayed ");
			Logger.log(LogStatus.PASS, objName + " enterd successfully");
		} else {
			Logger.log(LogStatus.FAIL, objName + " could not be found");
			System.out.println("Fail:" + objName + "could not found on the page");
		}
	}

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
