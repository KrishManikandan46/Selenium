package core_Java;

public class J23_ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {1,2,3,4,5};
	
		try {
			System.out.println(num[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("something went wrong");
		}finally {
			System.out.println("Finally block");
		}
	}

}
