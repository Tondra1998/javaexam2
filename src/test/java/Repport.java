import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Repport implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("========Test Started==========");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("=======Test is successful==============");

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        System.out.println("Test failed");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
