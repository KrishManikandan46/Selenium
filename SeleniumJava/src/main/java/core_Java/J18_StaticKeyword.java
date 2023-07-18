package core_Java;

public class J18_StaticKeyword {

	//static method

	public static void method1() {
		System.out.println("Java");
	}

	public void method2() {
		method1();
		System.out.println("Selenium");
	}

	// static block

	/*static {
		System.out.println("Java");
	}
	static {
		System.out.println("Selenium");
	}*/

	// static variables

	String language;
	static String automation;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method1();
		//J18_StaticKeyword obj = new J18_StaticKeyword();
		//obj.method2();

		//System.out.println("Cucumber");

		J18_StaticKeyword obj1 = new J18_StaticKeyword();
		obj1.language="Java";
		automation="Appium";

		J18_StaticKeyword obj2 = new J18_StaticKeyword();
		obj2.language="Python";
		automation="Katatlon Studio";

		J18_StaticKeyword obj3 = new J18_StaticKeyword();
		obj3.language="C#";
		automation="Selenium";

		System.out.println(obj1.language+" "+automation);
		System.out.println(obj2.language+" "+automation);
		System.out.println(obj3.language+" "+automation);	
	}

}
