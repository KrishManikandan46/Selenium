package f6_MustKnowJava;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class J06_JsonWriting {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Language1", "Java");
		jsonObject.put("Language2", "Python");

		JSONArray array = new JSONArray();
		array.add("Selenium");
		array.add("TestNG");
		array.add("Cucumber");

		jsonObject.put("Automation", array);

		FileWriter fileWriter = new FileWriter("1fileWriting.json");
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();
	}

}
