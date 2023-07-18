package f2_TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class T08_Parameterization {

	@Test
	@Parameters({"Programming language","released"})
	public void rider(String language,int year) {
		System.out.println(language+" is a popular programming language");
		System.out.println("Java is released in "+year);
	}
}
