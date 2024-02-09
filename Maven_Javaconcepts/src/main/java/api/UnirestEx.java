package api;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestEx {

	public void getReqEx() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse=Unirest.get("https://dummy.restapiexample.com/api/v1/employees").asJson();
		System.out.println("Status code:"+jsonResponse.getStatus());
		System.out.println("Status Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());
	}
	
	public void postReqEx() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse= Unirest.post("https://dummy.restapiexample.com/api/v1/create")
				.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "    \r\n"
				+ "}").asJson();
		System.out.println("Status code:"+jsonResponse.getStatus());
		System.out.println("Status Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());
	}
	
	public void putReqEx() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse= Unirest.put("https://dummy.restapiexample.com/api/v1/update/113")
				.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "    \r\n"
				+ "}").asJson();
		System.out.println("Status code:"+jsonResponse.getStatus());
		System.out.println("Status Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());
	}
	
	public void deleteReqEx() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse=Unirest.delete("https://dummy.restapiexample.com/api/v1/delete/2").asJson();
		System.out.println("Status code:"+jsonResponse.getStatus());
		System.out.println("Status Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());
	}
	
		public static void main(String[] args) throws UnirestException {
		UnirestEx unirest=new UnirestEx();
		//unirest.getReqEx();
        //unirest.postReqEx();	
		//unirest.putReqEx();
		unirest.deleteReqEx();
		}

	}


