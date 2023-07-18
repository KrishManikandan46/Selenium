package core_Java;

public class J10_Methods {

	public void method1() {
		System.out.println("Java");
	}

	public static void method2(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public static String method3(String name) {
		return name;
	}

	public static void recursive(int n) {
		if (n==1) {
			System.out.println(1);
		}else {
			System.out.println(n);
			recursive(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//J10_Methods obj = new J10_Methods();
		//obj.method1();
		//method2(7,10);
		//String automation = method3("Selenium");
		//System.out.println(automation);
		recursive(10);
	}

}
