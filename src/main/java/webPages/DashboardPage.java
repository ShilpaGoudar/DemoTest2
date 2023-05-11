package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By logoutButton = By.partialLinkText("Logout");
	By employeeDropdown = By.linkText("Employee");	
	By createLink = By.linkText("Create");
	
	public void clickLogout()
	{
		driver.findElement(logoutButton).click();
	}
	public void clickEmployee()
	{
		driver.findElement(employeeDropdown).click();
	}
	public void clickCreateLink()
	{
		driver.findElement(createLink).click();
	}
	public void varifyLogin()
	{
		String DashboardpageTitle = driver.getTitle();
		String ExpectedTitle = "Magnus";
		if(ExpectedTitle.equalsIgnoreCase(DashboardpageTitle))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}

}
