
package workingexample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import io.cucumber.java.en.*;
import io.cucumber.java.PendingException;

public class StepDefinitionTest {

   int withdrawal = 0; 
   
    @Given("^I have deposited \\$(\\d+) in my account$")
    public void iHaveDepositedMoneyInMyAccount(int amount) {
	  assertEquals(amount,100);
    }

    @When("^I request \\$(\\d+)$")
    public void iRequest(int amount){
	withdrawal = amount;
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $shouldBeDispensed(int amount){
	assertEquals(amount,withdrawal);
    }
}
