package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporter {
public static void main(String[] args) {
	// 1. Html file to write the report
	ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/reporter.html");
	// 2. Log file
	ExtentReports report = new ExtentReports();
	report.attachReporter(html);
	// Creating a test case
	ExtentTest testcase = report.createTest("Login Logout");
	testcase.assignAuthor("Balaji");
	testcase.assignCategory("Smoke");
	testcase.pass("Test step is passed");
	testcase.fail("Test case is faied");
	// copy the report from log -> html
	report.flush();
	
}
}
