package com.cts.training.companyservice;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.codehaus.jettison.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cts.training.companyservice.model.Company;
@SpringBootTest(classes=CompanyServiceApplication.class , webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
class CompanyControllerIntegrationTesting {
	@LocalServerPort
	private int port;
	HttpHeaders headers=new HttpHeaders();
	TestRestTemplate restTemplate=new TestRestTemplate();
	@Test
	public void test() throws Exception
	{
		String url="http://localhost:"+port+"/companyall";
		System.out.println("Port is ::"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(null,headers);
		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.GET,entity,String.class);
		String expected="{\"id\":11,\"ceoname\":\"sree\",\"companyname\":\"sindhura\",\"bod\":\"tanu\",\"sector\":\"noise\",\"turnover\":\"99868\"}";
		System.out.println("TEST1 :: Response Body :::: " +response.getBody());
		assertTrue(response.getBody().contains(expected));
	}
	@Test
	public void test1() throws Exception
	{
		String url="http://localhost:"+port+"/companyid/11";
		System.out.println("Port is ::"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(null,headers);
		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.GET,entity,String.class);
		String expected="{\"id\":11,\"ceoname\":\"sree\"";
		System.out.println("TEST1 :: Response Body :::: " +response.getBody());
		assertTrue(response.getBody().contains(expected));
	}
//	@Test
//	public void testadd() throws JSONException
//	{
//		String url="http://localhost:"+port+"/companyall";
//		//System.out.println("Port is ::"+url);
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		Company company=new Company(100,"info");
//		HttpEntity<Company> entity=new HttpEntity<Company>(company,headers);
//		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.POST,entity,String.class);
//		String expected="\"ceoname\":\"info\"";
//		System.out.println("Test add :: Response Body :::: " +response.getBody());
//		assertTrue(response.getBody().contains(expected));
//	}
	@Test
	public void testupdate() throws JSONException
	{
		String url="http://localhost:"+port+"/updatecompany";
		//System.out.println("Port is ::"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		Company company=new Company(181,"sri");
		HttpEntity<Company> entity=new HttpEntity<Company>(company,headers);
		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.PUT,entity,String.class);
		String expected="\"id\":181,\"ceoname\":\"sri\"";
		System.out.println("Test update :: Response Body :::: " +response.getBody());
		assertTrue(response.getBody().contains(expected));
	}
//	@Test
	public void testdelete() throws JSONException
	{
		String url="http://localhost:"+port+"/deletecompany/182";
		//System.out.println("Port is ::"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Company> entity=new HttpEntity<Company>(null,headers);
		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.DELETE,entity,String.class);
		//String expected="\"id\":176,\"ceoname\":\"infoview\"";
		System.out.println("Test delete :: Response Body :::: " +response.getBody());
		assertEquals(HttpStatus.OK,response.getStatusCode());
	}
}