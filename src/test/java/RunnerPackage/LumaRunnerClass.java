package RunnerPackage;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import BasePackage.BaseClassLuma;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\DemoFeature\\Luma.feature",glue = "StepPackage")
public class LumaRunnerClass extends BaseClassLuma{
	
	@BeforeClass
	public static void first() {
		BrowserLanuch();
		maximize();

	}

}
