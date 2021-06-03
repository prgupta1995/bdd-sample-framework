package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

	@Given("^User is on net banking landing page$")
	public void user_is_on_net_banking_landing_page() throws Throwable {
		// Code to navigate to login url
		System.out.println("Navigated to the login URL");
	}

	@When("^User is log into the application using username and password$")
	public void user_is_log_into_the_application_using_username_and_password() throws Throwable {
		// create a login
		System.out.println("Logged in succesfully.");
	}

	@Then("^User redirects to the home page$")
	public void user_redirects_to_the_home_page() throws Throwable {
		// home page validations
		System.out.println("Redirected succesfully to home page, validating home page.");
	}
	
	@When("^User is log into the application using \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_is_log_into_the_application_using_something_and_something(String strArg1, String strArg2) throws Throwable {
		System.out.println(strArg1);
		System.out.println(strArg2);
//		driver.findElement(by.cssSelector("").sendkeys(strArg1);
    }

	@Then("^Cards displayed \"([^\"]*)\"$")
	public void cards_displayed(String arg1) throws Throwable {
		System.out.println(arg1);
        // Write code here that turns the phrase above into concrete actions
	}

}