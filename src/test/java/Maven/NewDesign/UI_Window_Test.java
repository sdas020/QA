package Maven.NewDesign;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.Test;
/**
 * Unit test for simple App.
 */
public class UI_Window_Test {
	
	
	
	@Test
	public void TestSuite() throws InterruptedException, IOException
	{

	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	
	driver.get("https://cloud.google.com/stackdriver/");
	String url="https://cloud.google.com/stackdriver/";
	((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.NANOSECONDS);
	driver.findElement(By.xpath("//*[@id='cloud-site']/header/div[1]/a")).click();;
	//driver.quit();
	String parent_window = driver.getWindowHandle();
	Set<String> allWindows=driver.getWindowHandles();
	Iterator<String> allwindows1=allWindows.iterator();
	while(allwindows1.hasNext())
	{
		String child_window=allwindows1.next();
		if(!parent_window.equalsIgnoreCase(child_window))
		{
			driver.switchTo().window(child_window);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.NANOSECONDS);
			System.out.println("Parent window "+parent_window);
			System.out.println("Child window "+child_window);
//			
			//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.NANOSECONDS);
			Thread.sleep(20000);
			String Text=driver.findElement(By.xpath("//div//content[text()='Continue to ']")).getText();
		    System.out.println("Text "+Text);
			driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("souradip.ece.imps@gmail.com");
			System.out.println("Value "+driver.findElement(By.xpath("//*[@id='identifierId']")).getAttribute("value"));
			driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
			driver.quit();
			break;	
				

		}
	}
	
	}
}
