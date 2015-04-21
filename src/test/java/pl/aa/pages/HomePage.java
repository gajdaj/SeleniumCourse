package pl.aa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pl.aa.patterns.PatternPage;

public class HomePage extends PatternPage {

	private WebElement searchButton;
	private WebElement destinationAirport;
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	
	
	
	public void clickSearchButton(){
		searchButton = this.driver.findElement(By.id("flightSearchForm.button.reSubmit"));
		searchButton.click();
	}
	
	public void setDestinatioPort(String s){
		destinationAirport = this.driver.findElement(By.name("destinationAirport"));
		destinationAirport.sendKeys(s);
	}
	
	public void setAirport(String s){
		setDestinatioPort(s);
		clickSearchButton();
	}
	
	
}
