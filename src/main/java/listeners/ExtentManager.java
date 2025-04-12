package listeners;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports createInstance() {
        ExtentSparkReporter html = new ExtentSparkReporter("reports/extent.html");
        extent = new ExtentReports();
        extent.attachReporter(html);
        return extent;
    }
}
