package amazonPackage.ProjectAmazon2;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.BaseClass_Amazon;
import Utility.ListnersLogic;

//@Listeners(ListnersLogic.class)
public class Testcase1_LoginAmazon2 extends BaseClass_Amazon {

	
	@Test
	public void testCaseMethod()
	{
		LoginPage_Amazon l1=new LoginPage_Amazon(driver);
		l1.UN();
		l1.PWD();
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "sorry wroung title");
		
	}

}
