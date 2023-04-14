package TestStep;

import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginStep extends BaseStep {

    @And("I click login")
    public void iClickLogin() {
        login.setLogin();
    }

    @Then("Success to login")
    public void successToLogin() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Then("Show alert wrong email or password")
    public void showAlertWrongEmailOrPassword() {
        
    }

    @Then("Failed to login")
    public void failedToLogin() {
        
    }

    @Then("Show alert enter email")
    public void showAlertEnterEmail() {
        
    }

    @Then("Redirect to welcome page")
    public void redirectToWelcomePage() {

    }
}
