package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sun.tools.javac.util.List;

public class PracticeStepDefinitions {

	WebDriver driver;
	//Before all sceanrios
	@Before (order =0)
	public void setUp() {
		
	}
	
	@Before (order =1)
	public void setUp2() {
		
	}
	
	//After all scenarios
	
	@After(order=0)
	public void tearDown() {
		
	}
	@After(order=1)
	public void tearDown2() {
		
	}
	
	// before only first scenario
	@Before("@First")
	public void beforeFirst() {
		
	}
	
	// after only first scenario
	@After("@First")
	public void afterFirst() {
		
	}
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		
	}
	
	@When("^enters \"(.*)\" and \"(.*)\" $")
	public void username_and_pwd(String username, String pwd) {
		driver.findElement(By.id("abcd")).sendKeys(username);
		driver.findElement(By.name("def")).sendKeys(pwd);
	}
	
	
	@Then ("^clicks on login button$")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@name='click']")).click();
	}
	
	@When("^When user2 enters username and password$")
	public void user2_enters_username_and_password(DateTable credentials) {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.id("abcd")).sendKeys(data.get(0).get(1));
	}
	
}
