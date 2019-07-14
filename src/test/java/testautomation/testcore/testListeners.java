package testautomation.testcore;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import testautomation.maincore.Base;

public class testListeners implements ITestListener {
    Base objBase = new Base();

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            objBase.takeScreenShort(result.getName());
        } catch (Exception e) {

            e.printStackTrace();
        }
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