package Day6;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Chrome1  extends Capabilities{
	
		
		@Test
		public void  testApp()
		{
			driver.get("http://appium.io/");
			driver.findElement(By.className("navbar-toggle")).click();
		}

}
