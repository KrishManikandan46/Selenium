package core_Java;

public class J20_SuperKeywordSub extends J20_SuperKeyword{

	String name = "Python";

	public void method1() {
		System.out.println(super.name);
		super.method();
		System.out.println("Selenium");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J20_SuperKeywordSub obj = new J20_SuperKeywordSub();
		obj.method1();
	}

}
