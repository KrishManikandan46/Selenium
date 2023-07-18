package f6_MustKnowJava;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class J02_FileWriting {

	public static void fileWriter() throws IOException {
		String location = "C:\\Users\\91979\\Documents\\#1fileWriter.txt";
		String content = "Straight forward, direct interaction with files, less performance";

		FileWriter fileWriter = new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();
	}

	public static void bufferedWriter() throws IOException {
		String location = "C:\\Users\\91979\\Documents\\#2bufferedWriter.txt";
		String content = "Easiest way, performance wise better and widely used";

		FileWriter fileWriter = new FileWriter(location);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(content);
		bufferedWriter.close();
	}

	public static void fileOutputStream() throws IOException {
		String location = "C:\\Users\\91979\\Documents\\#3fileOutputStream.txt";
		String content = "for writing raw byte array information eg.images";

		FileOutputStream fileOutputStream = new FileOutputStream(location);
		byte[] b = content.getBytes();
		fileOutputStream.write(b);
		fileOutputStream.close();
	}

	public static void path() throws IOException {
		String location = "C:\\Users\\91979\\Documents\\#4path.txt";
		String content = "for writing raw byte array information eg.images";

		Path path = Paths.get(location);
		Files.write(path, content.getBytes());
	}

	public static void main(String[] args) throws IOException {
		fileWriter();
		bufferedWriter();
		fileOutputStream();
		path();
	}
}
