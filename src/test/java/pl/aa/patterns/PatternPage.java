package pl.aa.patterns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PatternPage {
	
	public static WebDriver driver;
	
	public PatternPage(WebDriver driver2){
		
		if(driver == null){
			driver = driver2;
			driver = new FirefoxDriver();
			driver.get("http://www.aa.com");
		}
	}
	
	
	public void closeDriver(){
		driver.close();
		driver = null;
	}
	public void quitDriver(){
		driver.quit();
	}
}
