package core_Java;

public class J21_ThisKeyword {

	String name;
	int year;

	public void method(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J21_ThisKeyword obj = new J21_ThisKeyword();
		obj.method("Java", 1995);
		System.out.println(obj.name);
		System.out.println(obj.year);
	}

}
