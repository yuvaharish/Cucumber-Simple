package stepDefin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hook {
	@Given("thanos has the infinity stone")
	public void thanos_has_the_infinity_stone() {
	   System.out.println("thanos has the infinity stone");
	}

	@When("thanos snap his fingures")
	public void thanos_snap_his_fingures() {
	    System.out.println("thanos snap his fingures");
	}

	@Then("half of the living thins died")
	public void half_of_the_living_thins_died() {
	   System.out.println("half of the living thins died");
	}

}
