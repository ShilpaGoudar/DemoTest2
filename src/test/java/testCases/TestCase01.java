package testCases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;
import webPages.DashboardPage;
import webPages.LoginPage;

public class TestCase01 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
	 
	 ChromeOptions chromeOptions = new ChromeOptions();
	 chromeOptions.addArguments("--remote-allow-origins=*");
	 ChromeDriver driver = new ChromeDriver(chromeOptions);
	 driver.get("https://magnus.jalatechnologies.com/"); 
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 LoginPage loginPageObject = new LoginPage(driver);
	 loginPageObject.loginToJalaAcademy();
	 loginPageObject.getTitleCheck();
	 
	 DashboardPage DashboardPageObject = new DashboardPage(driver);
	 Thread.sleep(1000);
	 DashboardPageObject.varifyLogin();
	 DashboardPageObject.clickEmployee();
	 Thread.sleep(2000);
	 DashboardPageObject.clickLogout();
	
	}
}
