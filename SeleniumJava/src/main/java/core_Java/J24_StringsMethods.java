package core_Java;

public class J24_StringsMethods {

	public static void strings() {

		//String language = "   Java   ";
		//int year = 1995;

		//System.out.println(language.charAt(0));
		//System.out.println(language.concat(" Selenium"));
		//System.out.println(language.contains("J"));
		//System.out.println(language.endsWith("a"));
		//System.out.println(language.equals("Java"));
		//System.out.println(language.equalsIgnoreCase("java"));
		//System.out.println(language.indexOf('a'));
		//System.out.println(language.indexOf('a', 2));
		//System.out.println(language.indexOf("Java"));
		//System.out.println(language.isEmpty());
		//System.out.println(language.length());
		//System.out.println(language.replace('J', 'j'));
		//System.out.println(language.replaceAll("Java", "Selenium"));
		//System.out.println(language.startsWith("J"));
		//System.out.println(language.substring(1));
		//System.out.println(language.substring(0, 1));
		//System.out.println(language.toLowerCase());
		//System.out.println(language.toUpperCase());
		//System.out.println(language.trim());
		//System.out.println(String.valueOf(year));

		System.out.println(String.join("-", "JAVA","SELENIUM","TESTNG","CUCUMBER"));

		String word = "Java Selenium";
		String[] w = word.split(" ");
		for (String a : w) {
			System.out.println(a);
		}
	}

	public static void stringBuffer() {
		StringBuffer buffer = new StringBuffer("Java");
		System.out.println(buffer);
		//System.out.println(buffer.capacity());
		//System.out.println(buffer.append(" Selenium"));
		//System.out.println(buffer.insert(0, "Python "));
		//System.out.println(buffer.delete(0, 1));
		//System.out.println(buffer.replace(0, 1, "j"));
		//System.out.println(buffer.reverse());
	}

	public static void stringBuilder() {
		StringBuilder builder = new StringBuilder("JAVA");
		System.out.println(builder);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//strings();
		stringBuffer();
		//stringBuilder();
	}
}
