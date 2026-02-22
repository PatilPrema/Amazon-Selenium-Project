package amazonPackage.ProjectAmazon2;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage_Amazon {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//div[@id=\"nav-link-accountList\"]/a/span")
    private WebElement AccountList;
	
	@FindBy(linkText="Your Account")
	private WebElement YourAccount;
	
	@FindBy(xpath="//span[text()='Edit addresses for orders and gifts']")
	private WebElement EditACcount;
	
	@FindBy(xpath="//a[text()='Edit                        ']")
	private WebElement EditACcounts;
	
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	private WebElement EditName;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement SerachBar;
	
	@FindBy(xpath="//span[text()='Kids']")
	private WebElement SearchwithFilter;
	
	public void AccountlistFeild()
	{
		Actions a = new Actions(driver);
		a.moveToElement(AccountList).perform();;
				
	}

	public void YourAccountFeild()
	{
		YourAccount.click();	
	}
	
	public void EditAccountFeild()
	{
		EditACcount.click();	
	}
	
	public void EditInfo()
	{
		EditACcounts.click();	
	}
	
	public void EditFullName()
	{
		EditName.sendKeys(" Pisutre");	
	}
	
	public void SearchItem(String name )
	{
		SerachBar.sendKeys(name);
		SerachBar.sendKeys(Keys.ENTER);
	}
	public String getcurrentURL()
	{
		return driver.getCurrentUrl()	;
	}
	
	public void SearchItemWithFilter()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(SearchwithFilter));
		SearchwithFilter.click();	
	}
	 
	
	public HomePage_Amazon(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
