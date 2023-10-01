package runnerdemo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features= {"src/test/resources/feature/orangehrmlogin.feature"},
         glue={"stepDefinitions"}
		
		
		//for google
		
//		features= {"src/test/resources/feature/google.feature"},
//		glue= {"stepDefinitions"}
                )
public class TestOrangeRunner {

}
