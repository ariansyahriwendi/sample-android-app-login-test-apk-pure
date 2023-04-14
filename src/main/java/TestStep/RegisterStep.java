package TestStep;

import BaseClass.BaseSetUp;
import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStep extends BaseStep {

    @Given("Account is not registered")
    public void accountIsNotRegistered() {
        BaseSetUp.reset();
    }

    @Given("Login page opened")
    public void loginPageOpened() {
    }

    @When("I click no account yet? create one")
    public void iClickNoAccountYetCreateOne() {
        register.setNotAccountYetCreateOne();
    }

    @And("I input name {string}")
    public void iInputName(String x) throws InterruptedException {
        Thread.sleep(1000);
        register.setName(x);
    }

    @And("I input email {string}")
    public void iInputEmail(String x) {
        register.setEmail(x);
    }

    @And("I input password {string}")
    public void iInputPassword(String x) {
        register.setPassword(x);
    }

    @And("I input confirm password {string}")
    public void iInputConfirmPassword(String x) {
        register.setConfirmPassword(x);
    }

    @And("I click register")
    public void iClickRegister() throws InterruptedException {
        Thread.sleep(1000);
        register.setRegister();
    }

    @Then("Success to register")
    public void successToRegister() throws InterruptedException {
        Thread.sleep(6000);
    }

    @And("I click already a member? login")
    public void iClickAlreadyAMemberLogin() {
        register.setAlreadyAMember();
    }

    @Then("Success to register and login")
    public void successToRegisterAndLogin() {
    }

    @Given("Account is registered")
    public void accountIsRegistered() {
    }

    @Then("Show alert registration successful")
    public void showAlertRegistrationSuccessful() {
    }

    @Then("Failed to register")
    public void failedToRegister() {
    }

    @Then("Show alert email already exists")
    public void showAlertEmailAlreadyExists() {
    }

    @Then("Show alert password does not matches")
    public void showAlertPasswordDoesNotMatches() {
        
    }

    @Then("Show alert enter password")
    public void showAlertEnterPassword() {
        
    }

    @Then("Show alert enter valid email")
    public void showAlertEnterValidEmail() {
        
    }

    @Then("Show alert enter full name")
    public void showAlertEnterFullName() {

    }
}
