package core_Java;

import java.util.Scanner;

public class J22_ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		char name = scanner.next().charAt(1);
		System.out.println(name);
		scanner.close();
	}

}
