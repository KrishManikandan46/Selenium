package core_Java;

public class J08_JumpStatements {

	public static void break1() {
		for (int i = 1; i <= 5; i++) {
			if (i==3) {
				break;
			}
			System.out.println(i);
		}
	}

	public static void continue1() {
		for (int i = 1; i <= 5; i++) {
			if (i==3) {
				continue;
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		break1();
		//continue1();
	}

}
