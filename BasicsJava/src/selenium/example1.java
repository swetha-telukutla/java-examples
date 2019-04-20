package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class example1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Initialize the driver Launch the browser Search web element perform
		 * action
		 */
		initializeDriver();
		launch("https://login.salesforce.com/");
		WebElement un = findElement(By.xpath(" //input[@id='username']"), "user name");
		enterText(un, "username", "abc@gmail.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "passWord");
		enterText(pass, "password", "pass123");
		WebElement remember = driver.findElement(By.cssSelector("#rememberUn"));
		clickCheckBox(remember, "Remember Me");
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		Thread.sleep(2000);
		driver.quit();

	}

	public static void initializeDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SankarA\\Downloads\\chromedriver_win32\\chromedriver.exe ");
		driver = new ChromeDriver();

	}

	public static void launch(String url) {

		driver.get(url);
		driver.manage().window().maximize();
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
			System.out.println("Pass: " + textValue + " " + "enterd in" + objName);
		} else {
			System.out.println("Fail: " + objName + " " + "could not be found");
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
			System.out.println("pass: " + objName + "found on the page");
		} catch (NoSuchElementException errMessage) {
			System.out.println("Fail:" + objName + "could not be found  on the page");

		}
		return obj;
	}

	public static void clickCheckBox(WebElement obj, String objName) {
		if (obj == null)
			return;
		if (!obj.isSelected()) {

			System.out.println("pass: " + objName + "found on the page");
		} else {
			System.out.println("Fail:" + objName + "could not be found  on the page");

		}

	}
}