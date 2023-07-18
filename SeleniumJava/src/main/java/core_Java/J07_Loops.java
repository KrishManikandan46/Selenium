package core_Java;

public class J07_Loops {
	
	// Iterative statements

	public static void forloop() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i+" Java");
		}
	}

	public static void whileloop() {
		int i = 1;
		while (i <= 5 ) {
			System.out.println(i+" Java");
			i++;
		}
	}

	public static void doWhileloop() {
		int i = 1;
		do {
			System.out.println(i+" Java");
			i++;
		} while (i <= 5);
	}

	public static void main(String[] args) {
		//forloop();
		//whileloop();
		doWhileloop();
	}
}
