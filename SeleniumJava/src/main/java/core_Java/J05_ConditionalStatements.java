package core_Java;

public class J05_ConditionalStatements {

	public static void main(String[] args) {

		String language = "Java";
		short year = 1995;
		short selenium = 2004;

		if (language.equals("Jav")) {
			System.out.println("Java is a popular programming language");
			if (year==1995) {
				System.out.println("Java is created in 1995");
			}	
		}
		else if (selenium==2004) {
			System.out.println("selenium is released in 2004");
		}
		else {
			System.out.println("End");
		}
	}
}
