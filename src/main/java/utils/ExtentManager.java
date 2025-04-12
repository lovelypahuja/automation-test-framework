package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static final ExtentReports extent = new ExtentReports();

    static {
        ExtentSparkReporter reporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        extent.attachReporter(reporter);
        extent.setSystemInfo("Framework", "Selenium + Rest Assured");
    }

    public static ExtentReports getInstance() {
        return extent;
    }
}
