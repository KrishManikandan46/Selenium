package f2_TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class T13_RetryFailedTestcase implements IRetryAnalyzer{

	int failedCount = 0;
	int limit = 4;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (failedCount<limit) {
			failedCount++;
			return true;
		}
		return false;
	}

}
