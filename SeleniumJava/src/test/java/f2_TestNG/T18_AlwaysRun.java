package f2_TestNG;

import org.testng.annotations.Test;

public class T18_AlwaysRun {

	@Test(timeOut = 2000)
	public void java() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Java");
	}

	@Test(dependsOnMethods = "java",alwaysRun = true)
	public void selenium() {
		System.out.println("Selenium");
	}
}
