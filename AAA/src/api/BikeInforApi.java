package api;

import java.util.ArrayList;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.oms.bean.ReceiveBikeInfor;;


public class BikeInforApi {
	public static final String PATH = "http://localhost:8080/";
	
	private Client client;
	
	public BikeInforApi() {
		client = ClientBuilder.newClient();
	}
	

	public ArrayList<ReceiveBikeInfor> getReceiveBikeInfor(Map<String, String> queryParams) {
		WebTarget webTarget = client.target(PATH).path("bikeinfor");
		
		
		if (queryParams != null) {
			for (String key : queryParams.keySet()) {
				String value = queryParams.get(key);
				webTarget = webTarget.queryParam(key, value);
			}
		}
		

		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.get();
		ArrayList<ReceiveBikeInfor> res = response.readEntity(new GenericType<ArrayList<ReceiveBikeInfor>>() {});
		System.out.println(res);
		return res;
	}
	

	public ReceiveBikeInfor updateReceiveBikeInfor(ReceiveBikeInfor bike) {
		WebTarget webTarget = client.target(PATH).path("bikeinfor").path(bike.getIdBike());
		
		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.post(Entity.entity(bike, MediaType.APPLICATION_JSON));
		
		ReceiveBikeInfor res = response.readEntity(ReceiveBikeInfor.class);
		return res;
	}
	
	
	
}
