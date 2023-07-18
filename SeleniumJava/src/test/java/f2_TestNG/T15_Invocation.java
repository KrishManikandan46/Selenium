package f2_TestNG;

import org.testng.annotations.Test;

public class T15_Invocation {

	@Test(invocationCount = 3)
	public void test() {
		System.out.println("TestNG");
	}
}
