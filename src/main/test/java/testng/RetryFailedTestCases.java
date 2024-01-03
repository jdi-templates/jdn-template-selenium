package testng;

import lombok.extern.log4j.Log4j2;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


@Log4j2
public class RetryFailedTestCases implements IRetryAnalyzer {
    private int retryCnt = 0;

    // This method will be called everytime a test fails.
    // It will return TRUE if a test fails and need to be retried, else it returns FALSE
    public boolean retry(ITestResult result) {
        // You could mention maxRetryCnt (Maximiun Retry Count) as per your requirement.
        // Here I took 2, If any failed testcases then it runs two times
        int maxRetryCnt = 1;
        if (retryCnt < maxRetryCnt) {
            log.info("Retrying " + result.getName() + " again and the count is " + (retryCnt+1));
            retryCnt++;
            return true;
        }
        return false;
    }

}

