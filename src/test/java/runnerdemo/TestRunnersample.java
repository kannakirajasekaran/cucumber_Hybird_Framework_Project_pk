package runnerdemo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
//		    for tutorialninja website
		
		          features= {"src/test/resources/featuredemo"},
		          glue={"stepDefinitionDemo","hookDemo"},
		          tags="@register",
//		          dryRun=true,
//		          publish=true,
//		          monochrome=true,
		          plugin={"pretty","html:target/cucumberReport/cucumber_html_Report.html",
		        		           "json:target/cucumberReport/cucumber_json_Report.json",
		        		           "junit:target/cucumberReport/cucumber_xml_Report.xml"}
                 )
public class TestRunnersample {

}
