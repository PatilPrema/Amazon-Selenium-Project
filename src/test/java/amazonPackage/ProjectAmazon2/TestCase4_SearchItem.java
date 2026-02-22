package amazonPackage.ProjectAmazon2;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.BaseClass_Amazon;

public class TestCase4_SearchItem extends BaseClass_Amazon
{

	@Test
	public void SearchItem()
	{
		LoginPage_Amazon l1=new LoginPage_Amazon(driver);
		l1.UN();
		l1.PWD();
		HomePage_Amazon Home = new HomePage_Amazon(driver);
		Home.SearchItem("shoe");
		WaitForUrlConatins("shoe");
		String url =Home.getcurrentURL();
		
		Assert.assertTrue(url.contains("shoe"));
		
	}
}
