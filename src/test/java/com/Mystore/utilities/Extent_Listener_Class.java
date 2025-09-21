package com.Mystore.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//com.Mystore.utilities.Extent_Listener_Class

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Listener_Class implements ITestListener {
	
	ExtentSparkReporter htmlreport;
	ExtentReports  reports;
	ExtentTest test ;
	
	public void configurationreport() {
		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName = "MyStoreTestReport-" + timestamp + ".html";
		htmlreport = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//" + reportName);
		reports = new ExtentReports();
		reports.attachReporter(htmlreport);	
		
		
		reports.setSystemInfo("Machine", "FAIZAN_PC");
		reports.setSystemInfo("browser", "chrome");
		reports.setSystemInfo("OS", "WIN 10");
		reports.setSystemInfo("Username", "Faizan"); 
		
		htmlreport.config().setDocumentTitle("Report Demo");
		htmlreport.config().setReportName("Faizan report");
		htmlreport.config().setTheme(Theme.STANDARD);
	}
	public void onStart(ITestContext Result) {
		configurationreport();
	}
	public void onFinish(ITestContext Result) {
		reports.flush();
	}
	public void onTestSuccess(ITestResult Result)
	{
		System.out.println("Name of the success test case is " +Result.getName());
		test = reports.createTest(Result.getName());
		test.log(Status.PASS,MarkupHelper.createLabel("name of pass testcase " +Result.getName(), ExtentColor.GREEN));
	}
	public void onTestFailure(ITestResult Result)
	{
		System.out.println("Name of the Failed testcase is " +Result.getName());
		test = reports.createTest(Result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel("Name of the fail testcase" +Result.getName(), ExtentColor.RED));

		String screnshotpath = System.getProperty("user.dir") + "//Screenshots//" +Result.getName() + ".png";
		File Screenshot = new File(screnshotpath);

		if (Screenshot.exists()) {
			test.fail("Capture screen are below :" +test.addScreenCaptureFromPath(screnshotpath));
		}

	}
	public void onTestSkipped(ITestResult Result) {
		System.out.println("Name of he Skipped testcase is " +Result.getName());
		test = reports.createTest(Result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("name of Skip testcases" +Result.getName(), ExtentColor.YELLOW));


	}
	public void onTestStart(ITestResult Result) {
		System.out.println("Name of the Started testcases "+Result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {

	}

}
