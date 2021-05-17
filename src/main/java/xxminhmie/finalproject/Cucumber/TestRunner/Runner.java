package xxminhmie.finalproject.Cucumber.TestRunner;
import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"xxminhmie.finalprodject.Cucumber.StepDefinition"})		
public class Runner {

}
