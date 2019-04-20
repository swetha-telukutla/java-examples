package selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase6 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SankarA\\Downloads\\chromedriver_win32\\chromedriver.exe ");
		driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 40);
		    driver.get("https://login.salesforce.com/"); 
			driver.manage().window().maximize();
			/*To enter user name*/
			WebElement Uname=driver.findElement(By.xpath("//*[@id='username']"));
			Uname.sendKeys("shankarreddy.t-ibof@force.com");
			/*To enter pwd*/
			WebElement pwd= driver.findElement(By.xpath("//*[@id='password']"));
			pwd.clear();
			pwd.sendKeys("Reddy@143");
			driver.findElement(By.xpath("//*[@id='Login']")).click(); 
			System.out.println("done");
		WebElement usermenu=driver.findElement(By.xpath("//*[@id='userNavButton']"));
		usermenu.click();
		WebElement myProfile = driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[1]"));
		myProfile.click();
		String oldWindow= driver.getWindowHandle();
		System.out.println(driver.getWindowHandle().toString());
		WebElement edit=driver.findElement(By.xpath(".//*[@id='chatterTab']/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		edit.click();
		driver.switchTo().frame("contactInfoContentId");
		WebElement about=driver.findElement(By.xpath(".//*[@id='aboutTab']/a"));
		about.click();
		WebElement lastName=driver.findElement(By.xpath(".//*[@id='lastName']"));
		lastName.clear();
		lastName.sendKeys("Salesforce");
		WebElement saveAll=driver.findElement(By.xpath(".//*[@id='TabPanel']/div/div[2]/form/div/input[1]"));
		saveAll.click();
		driver.switchTo().defaultContent();
		System.out.println("Clicked on saveAll  and back to default window");
		Thread.sleep(4000);
		//For Post
		WebElement post=driver.findElement(By.xpath(".//*[@id='publisherAttachTextPost']/span[1]"));
		post.click();
		System.out.println("Clicked on post");
		WebElement frame=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		System.out.println("Switched to frame"+ frame);
		WebElement messagebox=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body")));
		messagebox.click();
		System.out.println("Msg box clicked");
		Thread.sleep(2000);
		WebElement messagebox1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body")));
		System.out.println("Sending msg to post");
		messagebox1.sendKeys("just posted2 now");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		System.out.println("back to default frame");
		WebElement shareButtton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='publishersharebutton']")));
		shareButtton.click();
		System.out.println("Share clicked");
		//For File
		WebElement file=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='publisherAttachContentPost']/span[1]")));
		file.click();
		System.out.println("clicked on file");
		WebElement upload=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='chatterUploadFileAction']")));
		upload.click();
		System.out.println("clicked on upload");
		WebElement browse=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='chatterFile']")));
		browse.sendKeys("C:\\Users\\Admin-tekarch\\Desktop\\#Assignment 13.txt");
		WebElement share=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='publishersharebutton']")));
		share.click();
		Thread.sleep(5000);
		//Add photo
		Actions mousehoover=new Actions(driver);
		mousehoover.moveToElement(driver.findElement(By.xpath("//*[text()='Moderator']"))).perform();;
		WebElement addPhoto=driver.findElement(By.xpath(".//*[@id='uploadLink']"));
		addPhoto.click();
		Thread.sleep(5000);
		WebElement photoframe=driver.findElement(By.id("uploadPhotoContentId"));
		driver.switchTo().frame(photoframe);
		WebElement browsePhoto=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadInputFile']")));
		browsePhoto.sendKeys(" ");
		WebElement savePhoto=driver.findElement(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadBtn']"));
		savePhoto.click();
		Actions action=new Actions(driver); 
		action.dragAndDropBy(driver.findElement(By.xpath(".//*[@id='j_id0:outer']/div[1]/div/div/div/div[6]")), 100, 20);
		driver.findElement(By.xpath(".//*[@id='j_id0:j_id7:save']")).click(); 
		driver.switchTo().defaultContent();
	System.out.println("Test case 6 Completed");
	}
}



