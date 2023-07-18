package f2_TestNG;

import org.testng.annotations.Test;

public class T16_SetTimeouts {

	@Test(timeOut = 3000)
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("TestNG");
	}
}
