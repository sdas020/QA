package Maven.NewDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;



public class HomePage {
	
	@FindBy(xpath="//*[@id='userNavigationLabel']")
	private WebElement navigationLabel;
	@FindBy(xpath="//*[@id='navItem_language']/a/div[2]/div")
	private WebElement LanguageOption;
	
	
	private WebDriver driver=null;
	
	public void selectNavaigationLabel(String selectDetails)
	{
//		Select s=new Select(navigationLabel);
//		s.selectByValue(selectDetails);
		navigationLabel.click();
		// driver.findElements(By.xpath("//*[@class='uiScrollableAreaBody']//ul//li//a//span[1]")).get(122).click();
	//	List<WebElement> myElements = driver.findElements(By.xpath("//*[@class='//*[@class='uiScrollableAreaBody']//ul//li//a//span[1]"));
//	       for(WebElement e : myElements) {
//	         if(e.getText().equalsIgnoreCase(selectDetails)) {
//	             e.click();
//	             break;
//	         }
//	         else
//	         {
//	        	 Assert.fail();
//	         }
//	       }
	}
	public SettingsPage selectLanguageOption()
	{
		LanguageOption.click();
		SettingsPage sp=new SettingsPage(driver);
		return sp;
	}
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
