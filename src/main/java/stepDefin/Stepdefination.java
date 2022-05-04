package stepDefin;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefination {
	WebDriver driver;
	
	@Given("open browser with chrome")
	public void open_browser_with_chrome() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   
	}
	
	@When("login with valied {string} and {string}")
	public void login_with_valied_and(String string, String string2) {
		WebElement findElement = driver.findElement(By.id("username"));
		   findElement.sendKeys(string);
		   assertTrue(false);
		   WebElement findElement2 = driver.findElement(By.id("password"));
		   findElement2.sendKeys(string2);
		   WebElement login = driver.findElement(By.id("login"));
		   login.click();
		   
	}

	@Given("load adaction {string}")
	public void load_adaction(String string) {
	   driver.get("https://adactinhotelapp.com/");
	}

	
	@Then("I validate login homepage")
	public void i_validate_login_homepage() {
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.quit();
	}


}
