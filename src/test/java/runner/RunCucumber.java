package runner;

import java.io.File;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", "json:target/RunCucumber/cucumber.json",
				"html:target/RunCucumber/cucumber.html",
				"com.cucumber.listener.ExtentCucumberFormatter:target/RunCucumber/report.html"},
		features = "src/test/resources/features",
		glue = "stepDefinitions",
		tags = {"@Search-Cars"}
		
		)
public class RunCucumber extends AbstractTestNGCucumberTests {

	@BeforeClass
	public void setUp() {
		
		//Timestamp generation for fileName
		
		
		String fileName = "./target/Extent_Reports/report.html"; //location of generated reports
		File newFile = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
		
		//loads the extent config xml to customize on the report
		ExtentCucumberFormatter.loadConfig(new File("./src/test/resources/extent-config.xml")); //path of extent-config.xml
		
		//can add system information 
		ExtentCucumberFormatter.addSystemInfo("Browser name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser version", "v83.0.4103.116");

	}
}
