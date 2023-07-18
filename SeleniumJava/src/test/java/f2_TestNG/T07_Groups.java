package f2_TestNG;

import org.testng.annotations.Test;

public class T07_Groups {

	@Test(groups = "Web")
	public void rider1() {
		System.out.println("HTML,CSS");
	}
	@Test(groups = "Web")
	public void rider2() {
		System.out.println("JavaScript");
	}

	@Test(groups = "Languages")
	public void language1() {
		System.out.println("Java");
	}
	@Test(groups = "Languages")
	public void language2() {
		System.out.println("Python");
	}

	@Test(groups = "Testing")
	public void automate1() {
		System.out.println("Selenium");
	}
	@Test(groups = "Automation")
	public void automate2() {
		System.out.println("TestNG");
	}
}
