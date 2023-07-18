package f2_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class T10_Assertion {

	@Test
	public void hardAssert() {
		String name = "Java";
		int year = 1995;

		Assert.assertEquals(name, "java");
		Assert.assertEquals(year, 1995);
	}

	@Test
	public void softAssert() {
		String name = "Java";
		int year = 1995;

		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(name, "java");
		assert1.assertEquals(year, 1995);
	}
}
