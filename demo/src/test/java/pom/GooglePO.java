package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends library.BasePage
{
	public GooglePO(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(name="q")
	private WebElement searchTxtBx;
	public WebElement searchTxtBx()
	{
		return searchTxtBx;
	}
}
