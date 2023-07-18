package f2_TestNG;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class T17_HandleExceptions {

	@Test(timeOut = 3000,expectedExceptions = ThreadTimeoutException.class)
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("TestNG");
	}
}
