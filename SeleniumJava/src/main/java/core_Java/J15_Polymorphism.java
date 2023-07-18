package core_Java;

public class J15_Polymorphism {

	// Method overloading, Method overriding

	public static void method() {
		System.out.println("Selenium");
	}
	public static void method(String language, int year) {
		System.out.println(language+" "+year);
	}
	public static void method(int year, String language) {

	}
	public static void method(String language) {

	}
	public static void method(int year) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method("Java", 1995);
	}

}
