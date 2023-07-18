package f6_MustKnowJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class J03_FileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "C:\\Users\\91979\\Documents\\FileReader.txt";

		FileReader fileReader = new FileReader(location);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String reader;
		while((reader = bufferedReader.readLine())!=null) {
			System.out.println(reader);
		}
		bufferedReader.close();
	}

}
