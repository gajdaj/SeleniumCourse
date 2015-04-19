

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pl.aa.pages.HomePage;
import pl.aa.pages.MainPage;

public class AmericanAirline {
	
	public MainPage page;
	WebDriver driver;
	
	@BeforeMethod
	public void beforeTest(){
		this.driver = null;
		page = new MainPage(this.driver);
	}

	@Test(priority=1)
	public void testMainPage(){
			Assert.assertEquals(page.driver.getTitle().equals("aa.com"), true);
			page.closeDriver();
	}
	
	@Test (priority=2)
	public void testHomePage(){
		try {
			Thread.sleep(2000);
			page.getHomePage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.closeDriver();
	}	
	
	@Test(priority=3)
	public void testDepatur(){
		
		HomePage home = page.getHomePage();
		home.setAirport("LON");
		home.closeDriver();
	}
	

	
	

}
