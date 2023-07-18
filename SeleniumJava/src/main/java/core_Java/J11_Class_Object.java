package core_Java;

public class J11_Class_Object {

	String name;
	int year;

	public void display() {
		System.out.println(name);
		System.out.println(year);
	}

	public void setValues(String n, int y) {
		name = n;
		year = y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J11_Class_Object o1 = new J11_Class_Object();
		o1.setValues("Java", 1995);
		o1.display();

		J11_Class_Object o2 = new J11_Class_Object();
		o2.name="Selenium";
		o2.year=2004;
		o2.display();

	}

}