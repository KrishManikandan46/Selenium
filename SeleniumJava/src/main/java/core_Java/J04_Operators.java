package core_Java;

public class J04_Operators {

	public static void arithmetic() {
		// binary
		int a = 10;
		int b = 4;

		System.out.println(a+b);System.out.println(a-b);System.out.println(a*b);
		//System.out.println(a/b);
		float f = (float)a/(float)b;System.out.println(f);
		System.out.println(a%b);

		//incrementDecrement
		// unary
		int c = 5;
		c++;
		System.out.println(c);
		int d = 5;
		d--;
		System.out.println(d);

		int e = 2;
		System.out.println(e++);// post
		System.out.println(e);
		System.out.println(++e);// prefix
		System.out.println(e);		
	}

	public static void assignment() {
		int a = 10;
		a += 1;
		System.out.println(a);

		int s = 10;
		s -= 1;
		System.out.println(s);

		int m = 10;
		m *= 1;
		System.out.println(m);

		int d = 10;
		d /= 1;
		System.out.println(d);
	}

	public static void comparison() {
		// Relational operator
		int a = 10;
		int b = 7;

		System.out.println(a>b); // return boolean value true or false
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
	}

	public static void logical() {
		// and or not
		boolean t = true;
		boolean f = false;

		System.out.println(t&&f);
		System.out.println(t||f);
		System.out.println(!t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arithmetic();
		//assignment();
		//comparison();
		//logical();
	}

}
