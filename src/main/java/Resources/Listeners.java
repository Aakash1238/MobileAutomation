package Resources;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {


    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub

    }


    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub


    }

    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        //screenshot
        String s = result.getName();
//        try {
//           // BaseLib.getScreenshot(s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            BaseCloud.getScreenshot(s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub

    }

    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub

    }

}

