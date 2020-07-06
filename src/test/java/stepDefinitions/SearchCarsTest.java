package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utilities.SeleniumDriver;

public class SearchCarsTest {
	
	
	
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();  
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions(); 
	
	

	@Given("^I am on the Home page \" ( [ ^ \" ]* ) \" of CarsGuide website$")
	public void i_am_on_the_Home_page_of_CarsGuide_website(String stringURL) {
	    
		SeleniumDriver.openPage(stringURL);
	}

	@When("I move to menu")
	public void i_move_to_menu(List<String> list) {
	    String menu = list.get(1); //as 0th index is a header, first value will be at 1st index
	    System.out.println("Menu sleected is: "+menu);
	    
	    carsGuideHomePageActions.moveToBuyAndSellMenu();
	    
	    
	}

	@And("^click on \" ( [ ^\"] *)  \"link$")
	public void click_on_link(String searchCars) {
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("^select carbrand as \" ([^\"]* )  \" from AnyMake dropdown$")
	public void select_carbrand_as_from_AnyMake_dropdown(String carMake) {
		carsSearchPageActions.selectCarMake(carMake);	
	}
	

	@When("^select carmodel as \" ([^\"]* )   \" from AnyModel dropdown$")
	public void select_carmodel_as_from_AnyModel_dropdown(String carModel) {    
		carsSearchPageActions.selectModel(carModel);
	}

	@And("^select location as \" ([^\"]* )   \" from AnyLocation dropdown$")
	public void select_location_as_from_AnyLocation_dropdown(String location) {
		carsSearchPageActions.selectLocation(location);
		
	}

	@And("^select price as \" ([^\"]* )   \" from Price\\(max) dropdown$")
	public void select_price_as_from_Price_max_dropdown(String price) {
		carsSearchPageActions.selectCarPrice(price);
	}

	@And("^click on \" ([^\"]* )   \" button$")
	public void click_on_button(String string) {
	   carsSearchPageActions.clickOnFindMyCarBtn();
	}

	@Then("I should see list of searched cars")
	public void i_should_see_list_of_searched_cars() {
	    
	}

	@And("^the page title should be \" ([^\"]* )   \"  $")
	public void the_page_title_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
