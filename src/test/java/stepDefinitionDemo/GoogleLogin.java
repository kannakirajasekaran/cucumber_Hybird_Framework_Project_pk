package stepDefinitionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleLogin {
 WebDriver driver;
 WebElement box;
 
	@Given("user open application")
	public void user_open_application() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@When("user enter {string}")
	public void user_enter(String text) {
		 box= driver.findElement(By.id("APjFqb"));
		box.sendKeys(text);
	}

	@When("user click enter")
	public void user_click_enter() {
		box.sendKeys(Keys.ENTER);
		
	}

	@Then("user in apprapiate webpage")
	public void user_in_apprapiate_webpage() {
		System.out.println("success");
	}
}
