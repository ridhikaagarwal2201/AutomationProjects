package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testStepDefinitions {

	WebDriver driver;
	
@Given ("^the user is on login page for amazon website$")
public void the_user_is_on_login_page_for_amazon_website() {
	System.setProperty("chrome.webdriver.setpup", "C:\\eclipse_workspace\\chromedriver.exe");
	driver.get("http:www.amazon.in");
	if (driver.getTitle().contains("Sign-In"))
			System.out.println("Sign in page verified");

}

@When ("^the user enters \"(.*)\" and \"(.*)\"$")
public void the_user_enters_username_and_password(String username, String pwd) {
	//simple approach
	driver.findElement(By.id("abd")).sendKeys(username);
	driver.findElement(By.name("def")).sendKeys(pwd);
}
	
//using DataTable object

@When ("^the user enters username and pwd$")
public void the_user_enters_username_and_password(DataTable credentials) {
	//simple approach
	
	List <List<String>> data = credentials.raw();

	driver.findElement(By.id("abd")).sendKeys(data.get(0).get(0));
	driver.findElement(By.name("def")).sendKeys(data.get(0).get(1));
}
	

}
