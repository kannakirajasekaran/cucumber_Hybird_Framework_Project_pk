package stepDefinitionDemo;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmLogin {
	
	WebDriver  driver;
	
	@Given("User is on Home Page")
	public void User_is_on_HomePage() 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("<< user enter into homepage");
		
	}
	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(DataTable dataTable) {
		
    List<List<String>> list = dataTable.asLists(String.class);
    System.out.println(list.size());
    for(List<String> credential:list)
    {
    	String UserName = credential.get(0);
    	System.out.println(UserName);
    	String password=credential.get(1);
    	System.out.println(password);
    
    	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(UserName);
    	
    	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    }
	}

	@And("User enter login button")
	public void user_enter_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("verify the Dashboard page")
	public void verify_the_dashboard_page() {
	    
		Assert.assertEquals(driver.findElement(By.linkText("Dashboard")),"Dashboard");
	}

	@When("User enters InvalidCredentials to LogIn")
	public void user_enters_invalid_credentials_to_log_in(DataTable dataTable) 
	{
		
	Map<String,String> map = dataTable.asMap(String.class,String.class);
    System.out.println(map.size());
    String UserName1 = map.get("username");
    System.out.println(UserName1);
    String password1 = map.get("password");
    System.out.println(password1);
    {
    	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(UserName1);
    	
    	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password1);
    }
	}
}
