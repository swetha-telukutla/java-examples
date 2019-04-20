package selenium;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestCase7 {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest Logger;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		String path = "C:\\Swetha\\JanQaReports\\TestCase7.html";
		report = new ExtentReports(path);
		Logger = report.startTest("");
		initializeDriver();
		launch("https://login.salesforce.com/");

		WebElement un = findElement(By.xpath(" //input[@id='username']"), "user name");
		enterText(un, "username", "shankarreddy.t-ibof@force.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "passWord");
		enterText(pass, "password", "Reddy@143");

		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

		login.click();
		System.out.println("Pass:Saleforce application home page is logged with correct username.");

		Thread.sleep(4000);

		// driver.quit();
		/*
		 * WebElement usermenu = driver .findElement(By.xpath(
		 * "//span[@class='menuButtonLabel'][contains(text(),'SANKARA TELUKUTLA')]"
		 * )); Actions actions = new Actions(driver);
		 * actions.moveToElement(usermenu).perform(); System.out.println(
		 * "Pass:User menu drop dwon should be available"); usermenu.click();
		 * System.out.println("Pass:Drop down list is dislpayed");
		 * driver.findElement(By.xpath("//a[@title='My Settings']")).click();
		 * WebElement nw =
		 * driver.findElement(By.xpath("//a[@id='tryLexDialogX']")); nw.click();
		 * 
		 * System.out.println("Pass:My settings page is displayed"); WebElement
		 * personal = driver.findElement(By.xpath(
		 * "//body[contains(@class,'Setup sfdcBody brandQuaternaryBgr')]/div/div[@class='bodyDiv brdPalette brandPrimaryBrd']/table[@class='outer setupV2']/tbody/tr/td[@class='oLeft']/div[@class='mTreeSelection']/div/div[2]/a[1] "
		 * )); personal.click(); WebElement selectMenu =
		 * driver.findElement(By.id("userNav-arrow")); Select loginhistory = new
		 * Select(selectMenu);
		 * 
		 * loginhistory.selectByIndex(8);
		 * 
		 * System.out.println(
		 * "Pass:login history is disolayed and data is downloaded ");
		 * WebElement Display = driver .findElement(By.xpath(
		 * "//span[@class='folderText'][contains(text(),'Display & Layout')]"));
		 * // Display.click(); Actions action = new Actions(driver);
		 * action.moveToElement(Display).perform(); System.out.println(
		 * "Pass:User menu drop dwon should be available"); Display.click();
		 * System.out.println("Pass:Drop down list is dislpayed");
		 * driver.findElement(By.xpath(
		 * "//span[@class='leafText'][contains(text(),'Customize My Tabs')]"
		 * )).click();
		 */
		WebElement dd1 = driver.findElement(By.xpath(".//*[@id='userNav-arrow']"));
		dd1.click();
		System.out.println("Dropdown is clicked");

		WebElement mySettingLink = driver.findElement(By.xpath("//a[@title='My Settings']"));
		mySettingLink.click();
		System.out.println("My Settings link is clicked");

		WebElement personalLink = driver
				.findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']"));
		personalLink.click();
		System.out.println("Personal Link link is clicked");

		WebElement loginHistoryLink = driver.findElement(By.xpath("//a[@id='LoginHistory_font']"));
		loginHistoryLink.click();
		System.out.println("Login History Link is clicked");

		WebElement downloadLink = driver
				.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		downloadLink.click();
		System.out.println("DownLoad Link is clicked");

		Thread.sleep(1000);

		// Thread.sleep(1000);

		WebElement displayLayout = driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']"));
		displayLayout.click();
		System.out.println("Display Layout is clicked");

		WebElement customizeMyTab = driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']"));
		customizeMyTab.click();
		System.out.println("Customize My Tab is clicked");

		Select customApp = new Select(driver.findElement(By.xpath("//select[@id='p4']")));
		customApp.selectByVisibleText("Salesforce Chatter");
		System.out.println("Custom App is clicked");
		// Add Reports to Selected Tab
		Boolean found = false;
		java.util.List<WebElement> selectedTabsOptions = driver.findElements(By.xpath("//select[@id='duel_select_1']"));

		for (WebElement e : selectedTabsOptions) {

			if (e.getText().contains("Reports")) {
				found = true;
			}
		}

		if (found) {
			System.out.println("Reports is already added");
		} //else {
			//System.out.println("Reports not added");
			/*
			 * Select availableTabs = new Select(driver.findElement(By.xpath(
			 * "//select[@id='duel_select_0']")));
			 * availableTabs.selectByVisibleText("Reports"); System.out.println(
			 * "Custom App is clicked");
			 */

			WebElement addBtn = driver.findElement(By.xpath("//img[@title='Add']"));
			addBtn.click();
			System.out.println("Add button is clicked");
			Thread.sleep(4000);
			WebElement save = driver.findElement(By.name("save"));
			save.click();

			Thread.sleep(4000);
			WebElement email = driver.findElement(By.id("EmailSetup_font"));
			email.click();
			WebElement myemail = driver.findElement(By.id("EmailSettings_font"));
			myemail.click();
			WebElement atomaticRadio = driver.findElement(By.id("auto_bcc1"));
			atomaticRadio.click();
			WebElement saveb = driver.findElement(By.xpath("//input[@title='Save']"));
			saveb.click();
			WebElement calenReminder = driver.findElement(By.id("CalendarAndReminders_font"));
			calenReminder.click();
			WebElement reminder = driver.findElement(By.cssSelector("#Reminders_font"));
			reminder.click();
			WebElement testb = driver.findElement(By.id("testbtn"));
			testb.click();
			Thread.sleep(4000);
			Set<String> getAllWindows = driver.getWindowHandles();
			String[] window = getAllWindows.toArray(new String[getAllWindows.size()]);
			driver.switchTo().window(window[0]).close();
			System.out.println("executed");

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

			System.out.println("Pass: " + objName + " is displayed ");
			Logger.log(LogStatus.PASS, objName + " enterd successfully");
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
