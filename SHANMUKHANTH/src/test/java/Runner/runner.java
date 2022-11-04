package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class runner {

	
	
	@CucumberOptions(
			
			features="./src/test/java",
			glue = "partyStepDefinations",
			dryRun = true,
			monochrome= false,
			plugin= {
		              	"pretty"  }
	)
	public class Runn extends AbstractTestNGCucumberTests {

	}
}
