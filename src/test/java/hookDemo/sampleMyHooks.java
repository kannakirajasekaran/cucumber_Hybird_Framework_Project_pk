package hookDemo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class sampleMyHooks {

	@Before(order=0)
	public void setup(Scenario scenario)
	{
		System.out.println("+++ Before every step execute 1" +scenario.getName());
	}
	
	@Before(order=1)
	public void setupa()
	{
		System.out.println("+++ Before every step execute 2");
	}
	
	@BeforeStep
	public void beforestep()
	{
		System.out.println("^^^^^every steps before");
	}
	
	@After(order=1)
	public void teardowna(Scenario scenario)
	{
		System.out.println("--- after every step execute 1" +scenario.getName());
	}
	
	
	@After(order=0)
	public void teardownb()
	{
		System.out.println("--- after every step execute 2");
	}
	
}
