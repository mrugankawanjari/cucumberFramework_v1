package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {

	@FindBy(how = How.XPATH,using ="//*[@id='makes']")
	public WebElement selectMakeDropdown;
	
	@FindBy(how = How.XPATH,using ="//*[@id='models']")
	public WebElement selectModelDropdown;
	
	
	@FindBy(how = How.XPATH,using ="//*[@id='locations']")
	public WebElement selectLocationDropdown;
	
	@FindBy(how = How.XPATH,using ="//*[@id='priceTo']")
	public WebElement selectPriceDropdown;
	
	@FindBy(how = How.XPATH,using ="//*[@id='search-submit']")
	public WebElement findMyCarBtn;
	
	
	
	
}
