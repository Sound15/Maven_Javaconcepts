package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class JavaEx {
	
	public void getMethodExample() throws IOException {
		URL url=new URL("https://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		
		connection.setRequestMethod("GET");
		connection.connect();
		
		int statuscode=connection.getResponseCode();
		System.out.println("Status code is "+statuscode);
		
		String message=connection.getResponseMessage();
		System.out.println("Response Message is"+message);
		
		InputStream inputstream=connection.getInputStream();
		InputStreamReader inputstreamReader=new InputStreamReader(inputstream);
		BufferedReader bufferedReader=new BufferedReader(inputstreamReader);
		
		String line;
		StringBuffer buffer=new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
			
		}
		System.out.println(buffer);
	}
	
	public void postMethodExample() throws IOException {
		URL url=new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type","application/json");
		connection.setDoOutput(true);
		
		String jsonBody="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "    \r\n"
				+ "}";
		byte[] inputJson=jsonBody.getBytes();
		
		OutputStream outputStream=connection.getOutputStream();
		outputStream.write(inputJson);
		
		System.out.println("Response code: "+connection.getResponseCode());
		System.out.println("Request code: "+connection.getResponseMessage());
		
		InputStream inputstream=connection.getInputStream();
		InputStreamReader inputstreamReader=new InputStreamReader(inputstream);
		BufferedReader bufferedReader=new BufferedReader(inputstreamReader);
		
		String line;
		StringBuffer buffer=new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
			
		}
		System.out.println(buffer);
	}
	
	public void putMethodExample() throws IOException {
		URL url=new URL("https://dummy.restapiexample.com/api/v1/update/323");
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type","application/json");
		connection.setDoOutput(true);
		
		String jsonBody="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "    \r\n"
				+ "}";
		byte[] inputJson=jsonBody.getBytes();
		
		OutputStream outputStream=connection.getOutputStream();
		outputStream.write(inputJson);
		
		System.out.println("Response code: "+connection.getResponseCode());
		System.out.println("Request code: "+connection.getResponseMessage());
		
		InputStream inputstream=connection.getInputStream();
		InputStreamReader inputstreamReader=new InputStreamReader(inputstream);
		BufferedReader bufferedReader=new BufferedReader(inputstreamReader);
		
		String line;
		StringBuffer buffer=new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
			
		}
		System.out.println(buffer);
	}

	public void deleteMethodExample() throws IOException {
		URL url=new URL("https://dummy.restapiexample.com/api/v1/delete/2");
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type","application/json");
		connection.setDoOutput(true);
		
		System.out.println("Response code: "+connection.getResponseCode());
		System.out.println("Request code: "+connection.getResponseMessage());
		
		InputStream inputstream=connection.getInputStream();
		InputStreamReader inputstreamReader=new InputStreamReader(inputstream);
		BufferedReader bufferedReader=new BufferedReader(inputstreamReader);
		
		String line;
		StringBuffer buffer=new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
			
		}
		System.out.println(buffer);
	}

	public static void main(String[] args) throws IOException {
		
		JavaEx java=new JavaEx();
		//java.getMethodExample();
		//java.postMethodExample();
		//java.putMethodExample();
		java.deleteMethodExample();
	}

}
