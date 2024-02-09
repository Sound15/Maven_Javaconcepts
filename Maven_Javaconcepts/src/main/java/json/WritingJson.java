package json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WritingJson {

	public static void main(String[] args) throws IOException {
		JSONObject jsonobject=new JSONObject();
		jsonobject.put("Name", "Soundarya");
		jsonobject.put("Age", 1);
		
		JSONArray array=new JSONArray();
		array.add("magical smile");
		array.add("magnetic eyes");
		
		jsonobject.put("Special Qualities",array);
		
		FileWriter filewriter=new FileWriter("soundarya.json");
		filewriter.write(jsonobject.toJSONString());
		filewriter.close();
		
		

	}

}
