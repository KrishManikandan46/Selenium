package f2_TestNG;

import org.testng.annotations.Test;

public class T02_Priority {	

	@Test(priority = 0)
	public void rider() {
		System.out.println("Fabio Quartararo");
	}

	@Test(priority = 1)
	public void wrestler() {
		System.out.println("John Cena");
	}

	@Test(priority = 2)
	public void cricketer() {
		System.out.println("Mahendra Singh Dhoni");
	}
}
