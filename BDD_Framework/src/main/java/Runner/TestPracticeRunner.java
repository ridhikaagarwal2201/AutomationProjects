package Runner;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\AutomationTestRepository\\AutomationProjects\\BDD_Framework\\src\\main\\java\\Features\\Practice.feature",
		glue= {"stepDefinitions"},
		dryrun=false,
		strict=true,
		monochrome=true,
		format={"pretty","html:test-output"},
		tags= {"@Regression @Smoke"}, //OR
		tags= {"@Regression","@Smoke"}, //AND
		tags= {"~@Regression"} // ignore regression tagged scenarios
		
		)

public class TestPracticeRunner {

}
