package pl.aa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.aa.patterns.PatternPage;



public class MainPage extends PatternPage {
	
	public MainPage(WebDriver driver) {
		super(driver);
	}

	private Select selectCountery;

	private Select selectLanguage;

	private WebElement localeSubmit;
	
	
	
	public void selectCoutry(){
		selectCountery = new Select(this.driver.findElement(By.id("selectCountry")));
		selectCountery.selectByIndex(1);
	}
	
	public void selectLanguage(){
		selectLanguage = new Select(this.driver.findElement(By.id("selectLanguage")));
		selectLanguage.selectByIndex(1);
	}
	
	public void clickLocalSubmit(){
		localeSubmit = this.driver.findElement(By.name("localeSubmit"));
		localeSubmit.submit();
	}
	
	public HomePage getHomePage(){
		selectCoutry();
		//selectLanguage();
		clickLocalSubmit();
		return new HomePage(driver);
		//return new HomePage();
	}
	
	
}
