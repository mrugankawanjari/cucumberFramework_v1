package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utilities.SeleniumDriver;

public class CarsSearchPageActions {

	CarSearchPageLocators carSearchPageLocators = null;


	public void CarsSearchPageActions() {
		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}

	public void selectCarMake(String carMake) {

		Select select = new Select(carSearchPageLocators.selectMakeDropdown);
		select.selectByVisibleText("BMW");
	}

	public void selectModel(String carModel) {

		Select select = new Select(carSearchPageLocators.selectModelDropdown);
		select.selectByValue("1 Series");
	}


	public void selectLocation(String carLocation) {

		Select select = new Select(carSearchPageLocators.selectLocationDropdown);
		select.selectByVisibleText("ACT - All");
	}

	public void selectCarPrice(String carPrice) {

		Select select = new Select(carSearchPageLocators.selectPriceDropdown);
		select.selectByValue("1000");
	}

	public void clickOnFindMyCarBtn() {
		carSearchPageLocators.findMyCarBtn.click();
	}

}
