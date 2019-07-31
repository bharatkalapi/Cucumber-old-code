package testRunner;		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		



@RunWith(Cucumber.class)				
@CucumberOptions //(features="Feature", glue={"stepDefinitions.Steps"},tags = {"@testing","@Schoolpage"},plugin = {"pretty", "html:target/cucumber-html-report"},monochrome = true)
(
		features = "Feature",//#Path for the Feature files Folder. Given you have smoke.feature and login.feature files present in the Path#
        plugin ={"pretty","html:reports/test-report"},//#Path for the Reports Html Folder#
        tags= {"@testing"}//#Declaring multiple Feature names of files#
)			
public class Runner 	

{


}

