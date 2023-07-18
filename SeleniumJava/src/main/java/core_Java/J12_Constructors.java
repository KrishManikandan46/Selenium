package core_Java;

public class J12_Constructors {
	//default, non-parameterized, parameterized

	String name;
	int year;

	public J12_Constructors(String n, int y) {
		// TODO Auto-generated constructor stub
		//name = "Java";
		//year = 1995;

		name = n;
		year = y;
	}

	public J12_Constructors(String n) {
		name = n;

	}

	public void display() {
		System.out.println(name+" "+year);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//J12_Constructors obj = new J12_Constructors("Java",1995);
		J12_Constructors obj1 = new J12_Constructors("Selenium",2004);

		//default
		//System.out.println(obj.name);
		//System.out.println(obj.year);

		//non-parameterized
		//System.out.println(obj.name);
		//System.out.println(obj.year);

		//parameterized
		//System.out.println(obj1.name);
		//System.out.println(obj1.year);
		obj1.display();

		// constructor overloading
		J12_Constructors obj2 = new J12_Constructors("Cucumber");
		obj2.display();
	}

}
