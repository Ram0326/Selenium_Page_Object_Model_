package dummy;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {

	public static void main(String[] args) throws IOException {
		// file level context set
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/TestResult.html");
		reporter.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		// test case level
		ExtentTest createTest = extent.createTest("Create New Account");
				
		createTest.pass("Login element is clicked",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/sample.png").build());
		createTest.pass("Accounts element is clicked");
		
		
		// end of the report - at report level
		extent.flush();
		
		

	}

}
