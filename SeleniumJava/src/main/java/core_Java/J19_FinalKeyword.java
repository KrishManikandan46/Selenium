package core_Java;

public class J19_FinalKeyword {

	final String name = "Java";

	final public void method() {
		//name = "Python";
		System.out.println(name);
		System.out.println("Selenium");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J19_FinalKeyword obj = new J19_FinalKeyword();
		obj.method();
	}

}
