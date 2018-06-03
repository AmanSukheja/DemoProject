package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import org.testng.Assert;
import library.BaseTest;
import pom.GooglePO;
import pom.SearchPO;

public class Test1 extends BaseTest
{
	public WebDriverWait wait;
	@Test
	public void testFaceBookHome()
	{
		   wait=new WebDriverWait(driver, 20);
			driver.get("https//www.google.com");
			GooglePO googlePO=new GooglePO(driver);
			googlePO.searchTxtBx().sendKeys("facebook" +Keys.ENTER);
			SearchPO searchPO=new SearchPO(driver);
			searchPO.verifyElement(searchPO.facebookLink());
			searchPO.facebookLink().click();
			WebDriverWait wait=new WebDriverWait(driver,10);
			String eTitle="Facebook - log in or sign up";
			wait.until(ExpectedConditions.titleContains(eTitle));
			String aTitle=driver.getTitle();
			Reporter.log("Title displayed", true);
			Assert.assertEquals(aTitle, eTitle);
			//driver.navigate().back();
		
	}
}
