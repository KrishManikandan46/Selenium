package f6_MustKnowJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class J04_ConfigPropertyFile {

	public static void setConfig() throws IOException {
		Properties properties = new Properties();

		FileOutputStream fileOutputStream = new FileOutputStream("1SetConfig.properties");
		properties.setProperty("language", "Java");
		properties.setProperty("automation", "Selenium");
		properties.store(fileOutputStream, null);
	}

	public static void getConfig() throws IOException {
		Properties properties = new Properties();

		FileInputStream fileInputStream = new FileInputStream("2GetConfig.properties");
		properties.load(fileInputStream);
		String rider1 = properties.getProperty("rider1");
		String rider2 = properties.getProperty("rider2");
		System.out.println(rider1);
		System.out.println(rider2);
	}

	public static void main(String[] args) throws IOException {
		setConfig();
		getConfig();
	}
}
