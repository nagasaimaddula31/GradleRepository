package Pages;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.mockito.internal.exceptions.Reporter;
import org.openqa.selenium.By;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;

public class Homepage extends PageObject
{
	private By AdminButton=By.xpath("//span[normalize-space()='Admin']");
	private By jobsTab=By.xpath("//span[normalize-space()='Job']");
	private By JobTitles=By.xpath("//a[nofrmalize-space()='Job Titles']");
	private By userProfiele=By.xpath("//i[contains(@class,'oxd-userdropdown-icon')]");
	private By userLogout=By.xpath("//a[normalize-space()='Logout']");
	static String title="OrangeHRM";
	
	static String title2="OrangfeHRM";
	static String title3="OrangeHRMs";
//stashed change
	
	public void verifyHomepage()  {
		
	assertTrue(getDriver().getTitle().contains(Homepage.title));
	}
	
	   public void clickAdminTab()
	    {
	    	$(AdminButton).click();
	    }
	   
	public void navigateToJobTitles()
	{
		$(jobsTab).click();
		$(JobTitles).click();
	}
	public void logout()
	{
		$(userProfile).click();
		$(userLogout).click();

	}
}
