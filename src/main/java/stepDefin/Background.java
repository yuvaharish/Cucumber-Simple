package stepDefin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background {
	
	@Given("the student finished high school")
	public void the_student_finished_high_school() {
	    System.out.println("the student finished high school");
	}

	@Given("the student finished higeher scendary")
	public void the_student_finished_higeher_scendary() {
	   System.out.println("the student finished higeher scendary");
	}

	@Given("the student applied for the Engineering course")
	public void the_student_applied_for_the_engineering_course() {
	    System.out.println("the student applied for the Engineering course");
	}

	@When("the student have a cut off mark")
	public void the_student_have_a_cut_off_mark() {
	   System.out.println("the student have a cut off mark");
	}

	@Then("the student is eligible for joing any engeinering institute")
	public void the_student_is_eligible_for_joing_any_engeinering_institute() {
	   System.out.println("the student is eligible for joing any engeinering institute");
	}


}
