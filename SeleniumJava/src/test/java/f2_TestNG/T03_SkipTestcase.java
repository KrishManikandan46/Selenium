package f2_TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class T03_SkipTestcase {

	@Test(enabled = false)
	public void rider() {
		System.out.println("Fabio Quartararo");
	}
	
	@Test
	public void wrestler() {
		System.out.println("John Cena");
		throw new SkipException("This test is skipped");
	}
	
	@Test
	public void cricketer() {
		System.out.println("Mahendra Singh Dhoni");
	}
}
