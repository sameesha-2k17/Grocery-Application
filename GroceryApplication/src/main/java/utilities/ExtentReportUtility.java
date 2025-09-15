package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {
	// ExtentReports class used for generating custom report. it takes all the info and give(return) us as template for 
	public static final ExtentReports extentReports = new ExtentReports();//static instance of extentreports that can be shared across the application
	
	public synchronized static ExtentReports createExtentReports() {
		//Creates an instance of the reporter that will generate the HTML report in the path "./extent-reports/extent-report.html".
		
		//extent-reports = folder name  filename=extent-report.html
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");// to create folder
		reporter.config().setReportName("7R Mart SuperMarket");// name
		extentReports.attachReporter(reporter);//attaching the folder creation and report name to the ExtendReprt clss
		extentReports.setSystemInfo("Organization", "Obsqura");
		extentReports.setSystemInfo("Name", "Silpa"); //provides context of the report
		return extentReports;
	}
	
	// context of the report= organisation of the name , name etc
}
	


