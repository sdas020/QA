package Maven.NewDesign;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.Test;
/**
 * Unit test for simple App.
 */
public class UI_table_Validation {
	
	
	
	@Test
	public void TestSuite() throws InterruptedException, IOException
	{
	//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	
//	driver.get("https://www.guru99.com/alm-qtp-selenium-difference.html");

//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.NANOSECONDS);
//	List<WebElement> List= driver.findElements(By.xpath("//table[@class='table table-striped']//tbody//tr"));
//	int i=List.size();
//	//HP QTP is more user friendly and scripts are developed quickly.
//	
//	System.out.println("Row Count : " +i);
//	List<WebElement> List1= driver.findElements(By.xpath("//table[@class='table table-striped']//tbody//tr[2]//td"));
//	System.out.println("Column Count : " +List1.size());
//	for(int j=2;j<=i;j++)
//	{
//		String text=driver.findElement(By.xpath("//table[@class='table table-striped']//tbody//tr["+j+"]//td[1]")).getText();
//		String text1=driver.findElement(By.xpath("//table[@class='table table-striped']//tbody//tr["+j+"]//td[1]")).getText();
//		if(text.equalsIgnoreCase("HP QTP is more user friendly and scripts are developed quickly."))
//		{
//			String otherText=driver.findElement(By.xpath("//table[@class='table table-striped']//tbody//tr["+j+"]//td[2]")).getText();
//			System.out.println("Text " +otherText);
//		}
//		else{
//			System.out.println(text1);
//		}
//	}	
	driver.get("http://localhost:8082/FormValidation/");
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id='OnwardJorney']")).click();
	Select onwardjourney = new Select(driver.findElement(By.xpath("//*[@name='SourcePoint']")));
	onwardjourney.selectByIndex(2);
	Select returnjourney = new Select(driver.findElement(By.xpath("//*[@name='DestinationPoint']")));
	returnjourney.selectByIndex(1);
	driver.findElement(By.xpath("//*[@id='stdate']")).sendKeys("12-08-2019");
    List<WebElement> date= driver.findElements(By.xpath("tr//td"));
    date.size();
    System.out.println("Count:"+date.size());
	driver.close();
	}
	
}
