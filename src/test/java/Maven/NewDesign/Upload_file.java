package Maven.NewDesign;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.Test;
/**
 * Unit test for simple App.
 */
public class Upload_file {
	
	
	
	@Test
	public void TestSuite() throws InterruptedException, IOException
	{

	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	
	driver.get("https://html.com/input-type-file/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.NANOSECONDS);
	Thread.sleep(15000);
	driver.findElement(By.xpath("//*[@id='post-206']/header/h1/thrive_headline/input")).sendKeys("C:\\Users\\Souradip\\Desktop\\Capgemini doc\\HTML_Doc.html");
	
	String url="https://mail.rediff.com/cgi-bin/login.cgi";
	((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", url);
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//div[@class='margTop10']//div[1][@class='floatL']//input")).click();
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("proceed"))).click();
	
	//driver.findElement(By.name("proceed")).click();
	Alert alert = driver.switchTo().alert();
	Thread.sleep(5000);
	System.out.println("Text " +alert.getText());
	alert.accept();
	driver.quit();
	alert.sendKeys("");
	DesiredCapabilities capability = DesiredCapabilities.firefox();
	
	
	}
}
