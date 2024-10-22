package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ContactStep extends BaseClass {
	@Given("User lounch {string} browser")
	public void user_lounch_browser(String string) {
		BaseClass.initialization();
	}

	@Given("User login with validate cretendial")
	public void user_login_with_validate_cretendial() {
       String title=driver.getTitle();
       Assert.assertEquals(title.contains("Cogmento CRM"), true);
	}

	@When("user switch to contact module")
	public void user_switch_to_contact_module() {

	}

	@When("user click on craete button")
	public void user_click_on_craete_button() {

	}

	@When("user enter first name as {string},last name {string} and middle name {string}")
	public void user_enter_first_name_as_last_name_and_middle_name(String string, String string2, String string3) {

	}

	@When("user select status as {string} and discription as {string}")
	public void user_select_status_as_and_discription_as(String string, String string2) {

	}

	@When("user click on save button")
	public void user_click_on_save_button() {

	}

	@Then("contact should be created")
	public void contact_should_be_created() {

	}

}
