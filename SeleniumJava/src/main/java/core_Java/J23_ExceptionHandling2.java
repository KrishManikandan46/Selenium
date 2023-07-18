package core_Java;

public class J23_ExceptionHandling2 {

	public static void method(int age) {
		if (age<18) {
			throw new ArithmeticException("Invalid age");
		}else {
			System.out.println("Valid age");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method(18);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
