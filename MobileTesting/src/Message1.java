import org.junit.Test;

public class Message1 extends Capabilities {
	@Test
	public void testApp() throws InterruptedException
	{
		driver.scrollTo("RM-ACTTEL").click();
	//	driver.scrollToExact("RM-ACTTEL 3").click();
		Thread.sleep(3000);
	}
	

}
