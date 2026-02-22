package amazonPackage.ProjectAmazon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage_Amazon
{
	WebDriver driver;
	
	
	
	   @FindBy(name="email")
	   WebElement Username;
	   
	   @FindBy(id="continue")
	   WebElement UN_Continue;
	   
	   @FindBy(id="ap_password")
	   WebElement Password;

	   @FindBy(id="signInSubmit")
	   WebElement SignInButton;
	   
	  //2nd step
	   
	   public void UN()
	   {
		   Username.sendKeys("918095378203");
		   UN_Continue.click();
		  
	   }
	   public void PWD()
	   {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   WebElement password = wait.until(ExpectedConditions.visibilityOf(Password));
		   password.sendKeys("PreLax@#1234");
		   SignInButton.click();
	   }
	   
	  //3rd step
	   
	  public LoginPage_Amazon(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	
}
