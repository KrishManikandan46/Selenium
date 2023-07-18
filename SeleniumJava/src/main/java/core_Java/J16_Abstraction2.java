package core_Java;

public class J16_Abstraction2 extends J16_Abstraction1 implements J17_Interface1,J17_Interface2{

	// method overriding
	public void method2() {
		System.out.println("Selenium");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J16_Abstraction1 obj = new J16_Abstraction2(); 
		obj.method2();
		J16_Abstraction2 obj2 = new J16_Abstraction2(); 
		obj2.imethod();
	}

	@Override
	public void imethod() {
		// TODO Auto-generated method stub
		System.out.println("Cucumber");
	}

	@Override
	public void Imethod() {
		// TODO Auto-generated method stub

	}

}
