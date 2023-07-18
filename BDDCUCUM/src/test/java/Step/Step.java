package Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {
	@Given("user is on Login page")
	public void user_is_on_login_page() {
	   System.out.println("From Given ");
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("From When ");
	}

	@And("clicked on login button")
	public void clicked_on_login_button() {
		System.out.println("From And ");
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		System.out.println("From Then ");
	}



}
