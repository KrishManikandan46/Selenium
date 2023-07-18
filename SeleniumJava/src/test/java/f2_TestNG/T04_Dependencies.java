package f2_TestNG;

import org.testng.annotations.Test;

public class T04_Dependencies {

	@Test
	public void moto3() {
		System.out.println("Aymu Sasaki");
	}

	@Test(dependsOnMethods = "moto3")
	public void moto2() {
		System.out.println("Tony Arbolino");
	}

	@Test(dependsOnMethods = "moto2")
	public void motogp() {
		System.out.println("Fabio Quartararo");
	}
}
