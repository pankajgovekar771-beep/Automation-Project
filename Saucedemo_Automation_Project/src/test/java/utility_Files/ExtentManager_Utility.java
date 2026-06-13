package utility_Files;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager_Utility 
{
public static ExtentReports extent;

public static ExtentReports createInstance() {
	String filename="./reports/TestReport.html";
	ExtentSparkReporter htmlReporter = new ExtentSparkReporter(filename);
	
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("os", "windows");
	extent.setSystemInfo("Environment", "QA");
	
	return extent;
}
}
