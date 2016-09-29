package me.prince;

import java.util.Base64;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

public class ClientTest {

	public static void main(String args[]) {
		RestTemplate restTemplate = new RestTemplate();
		String plainCreds = "user:password";
		
		byte[] plainCredsBytes = plainCreds.getBytes();
		byte[] base64CredsBytes = Base64.getEncoder().encode(plainCredsBytes);
		String base64Creds = new String(base64CredsBytes);
		System.out.println(base64Creds);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + base64Creds);
		
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<Object> quote = restTemplate.exchange("http://postalCode.com/rest/postalCode/416729", HttpMethod.GET, request, Object.class);
		System.out.println(quote.getBody().toString());
		Gson gson = new Gson();
		System.out.println(gson.toJson(quote.getBody()));
	}
}
