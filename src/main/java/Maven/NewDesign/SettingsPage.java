package Maven.NewDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class SettingsPage {
	
	
	//ul[2]/li/a/span[1]/span[@text()='Edit']
	//*[@id="SettingsPage_Content"]/ul/li[2]/div/div/ul[2]/li/a/span[1]/span
	@FindBy(xpath="//span[@class='uiIconText fbSettingsListItemEdit']")
	private WebElement LanguageEditOption;
	//*[@id="u_6r_4"]/div/div/div
	//span[@class='uiIconText fbSettingsListItemEdit']
	@FindBy(xpath="//div[@class='fbSettingsSectionsItemContent rfloat _ohf']//ul[2]//li//a//span//span")
	//@FindBy(xpath="//span[@class='uiIconText fbSettingsListItemEdit']")
	public WebElement LanguageUpdateEditBOx;
	//*[@id="u_1i_1"]
	@FindBy(xpath="//*[@id='u_1i_1']")
	private WebElement SaveChangesButton;
	private WebDriver driver=null;
	
	
	public void selectLanguageEditOption()
	{
		LanguageEditOption.click();
	}
	public void selectLanguageUpdateEditBOx(String language)
	{
		Select s=new Select(LanguageUpdateEditBOx);
		LanguageUpdateEditBOx.sendKeys(language);
		s.selectByIndex(0);
	}
	public void clickSaveChangesButton()
	{
		SaveChangesButton.click();
	}
	
	
	public SettingsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
