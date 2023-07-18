package core_Java;

public class J09_Arrays {

	public static void singleArray() {
		int[] no = new int[5];
		no[0]=46;
		no[1]=10;

		for (int i = 0; i < 5; i++) {
			System.out.println(no[i]);
		}
	}

	public static void multiArray() {
		int[][] no = new int[5][2];
		no[0][0]=46;
		no[0][1]=10;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(no[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//singleArray();
		multiArray();
	}

}
