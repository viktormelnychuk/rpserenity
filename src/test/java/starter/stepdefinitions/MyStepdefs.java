package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;

public class MyStepdefs {

    @When("I do {string} request")
    public void iDoRequest(String arg0) throws InterruptedException {
        sendReq(arg0);
    }

    @Then("I receive success response")
    public void iReceiveSuccessResponse() throws InterruptedException {
        expect("success");
    }

    @Then("I receive fail response")
    public void iReceiveFailResponse() throws InterruptedException {
        test
        expect("failure");
    }

    @Step
    public void sendReq(String arg) throws InterruptedException {
        Thread.sleep(1000);
        System.out.printf("Doing the %s request%n", arg);
    }

    @Step
    public void expect(String arg) throws InterruptedException {
        Thread.sleep(1000);
        System.out.printf("Expecting to have %s\n", arg);
    }
}
