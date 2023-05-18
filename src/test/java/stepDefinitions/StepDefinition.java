package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefinition {

    @Given("^user is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //code to navigate to login url
    }

    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        //code to log in
    }

    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //home page validation
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        //validating the cards
    }

}