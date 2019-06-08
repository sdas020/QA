package Maven.NewDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='loginbutton']")
	private WebElement LoginButton;
	
	private WebDriver driver=null;
	
	

	public void setEmail(String emailID)
	{
		email.sendKeys(emailID);
	}
	
	public void setPassword(String emailID)
	{
		password.sendKeys(emailID);
	}
	public HomePage ClickLoginButton()
	{
		LoginButton.click();
		HomePage hp=new HomePage(driver);
		return hp;
	}
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	

}
