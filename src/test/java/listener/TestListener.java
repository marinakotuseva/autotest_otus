package listener;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.PrintWriter;
import java.io.StringWriter;

public class TestListener implements ITestListener {

    private Logger logger = Logger.getLogger((TestListener.class));

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("Поехали!");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("Гагарин в космос летал... и вернулся");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("Пичаль!!! " + result.getTestClass() + result.getTestName());

        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        Throwable cause = result.getThrowable();
        cause.printStackTrace(printWriter);

        logger.error(stringWriter.getBuffer().toString());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
