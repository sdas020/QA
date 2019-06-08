package Maven.NewDesign;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

public class endToEndTest {
	
	
	
	@Test
	public void TestSuite() throws InterruptedException, IOException
	{

	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.NANOSECONDS);
	LoginPage lp=new LoginPage(driver);
	lp.setEmail("souro.sunny@gmail.com");
	lp.setPassword("Souradip@1993newpassword1");
	HomePage hp=lp.ClickLoginButton();
	driver.get("https://www.facebook.com/settings");
//	hp.selectNavaigationLabel("Settings");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//span[@class='_54nh'][text()='Settings']")).click();
//	
	SettingsPage sp=hp.selectLanguageOption();
	//sp.selectLanguageEditOption();
	Actions action = new Actions(driver); 
	action.click();
	action.build().perform();
	//driver.switchTo().frame("contentCol"); 
	driver.findElement(By.xpath("//div[@class='fbSettingsSectionsItemContent rfloat _ohf']//ul[2]//li//a//span//span")).click();
//	List<WebElement> myElements=driver.findElements(By.xpath("//span[@class='fbSettingsListItemContent fcg']"));
//	List<WebElement> myElements1=driver.findElements(By.xpath("//span[@class='uiIconText fbSettingsListItemEdit']"));
//	 for(WebElement e : myElements) {
//         if(e.getText().equalsIgnoreCase("Which languages do you understand?")) {
//        	 System.out.println("Text1 : "+e.getText());
//        	 myElements1.iterator();
//        	 driver.findElement(By.xpath("//span[@class='uiIconText fbSettingsListItemEdit']")).click();	 
//             break;
//         }
//        
//       }
//	 TakesScreenshot ts=(TakesScreenshot)driver;
//	 File source= ts.getScreenshotAs(OutputType.FILE);
//	 FileUtils.copyFile(source, new File("./reports/facebook.png"));
//	 
	//driver.findElements(By.xpath("//span[@class='uiIconText fbSettingsListItemEdit']")).get(2).click();
	//driver.switchTo().defaultContent();
//	sp.selectLanguageUpdateEditBOx("Tamil");
//	sp.clickSaveChangesButton();
//	
	}
	
}
