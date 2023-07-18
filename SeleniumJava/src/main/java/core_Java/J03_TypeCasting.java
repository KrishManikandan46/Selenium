package core_Java;

public class J03_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// widening casting - converting smaller to larger - Automatically 
		int i = 10;
		float f = i;
		System.out.println(i);
		System.out.println(f);


		// narrowing casting - converting larger to smaller - Manually 
		float f2 = 20.46f;
		int i2 = (int)f2;
		System.out.println(f2);
		System.out.println(i2);
	}

}
