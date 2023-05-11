package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By userName = By.id("UserName");
	By password = By.id("Password");
	By signInButton = By.id("btnLogin");
	By forgotPasswordButton = By.partialLinkText("Forgot");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loginToJalaAcademy()
	{
		driver.findElement(userName).sendKeys("training@jalaacademy.com");
		driver.findElement(password).sendKeys("jobprogram");
		driver.findElement(signInButton).click();
	}
	
	public void getTitleCheck() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title is Correct");
		}
		else
		{
			System.out.println("Title is wrong");
		}
	}

}
