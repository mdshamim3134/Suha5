import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\shamama\\eclipse-workspace\\"
		+ "MavenSweety\\src\\main\\java\\AllFile\\shamim.feature",tags= {"@smoke"})
public class Runner {

}
