package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class SearchPO extends BasePage
{
	public SearchPO(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
	private WebElement facebookLink;
	public WebElement facebookLink()
	{
		return facebookLink;
	}
	
}
