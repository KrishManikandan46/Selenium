package core_Java;

public class J13_GetterSetter {

	String name;
	int year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J13_GetterSetter obj = new J13_GetterSetter();
		obj.setName("Java");
		obj.setYear(1995);
		System.out.println(obj.getName());
		System.out.println(obj.getYear());
	}

}
