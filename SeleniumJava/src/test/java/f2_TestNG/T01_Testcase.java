package f2_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class T01_Testcase {

	@Test
	public void rider() {
		Assert.fail();
		System.out.println("Fabio Quartararo");
	}
	
	@Test
	public void wrestler() {
		System.out.println("John Cena");
	}
	
	@Test
	public void cricketer() {
		System.out.println("Mahendra Singh Dhoni");
	}
}
