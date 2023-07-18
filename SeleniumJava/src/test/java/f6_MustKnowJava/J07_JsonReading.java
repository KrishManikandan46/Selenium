package f6_MustKnowJava;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class J07_JsonReading {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jsonParser = new JSONParser();

		FileReader fileReader = new FileReader("1fileWriting.json");
		Object object = jsonParser.parse(fileReader);

		JSONObject jsonObject = (JSONObject) object;
		String Language1 = (String) jsonObject.get("Language1");
		String Language2 = (String) jsonObject.get("Language2");
		System.out.println(Language1);System.out.println(Language2);

		JSONArray array = (JSONArray) jsonObject.get("Automation");

		@SuppressWarnings("unchecked")
		Iterator<String> iterator = array.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

}
