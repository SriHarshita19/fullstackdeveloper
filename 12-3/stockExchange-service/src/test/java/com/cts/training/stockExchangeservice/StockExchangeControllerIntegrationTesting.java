package com.cts.training.stockExchangeservice;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;
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

import com.cts.training.stockExchangeservice.model.StockExchange;
@SpringBootTest(classes=StockExchangeServiceApplication.class , webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
public class StockExchangeControllerIntegrationTesting
{
	@LocalServerPort
	private int port;
	HttpHeaders headers=new HttpHeaders();
	TestRestTemplate restTemplate=new TestRestTemplate();
	@Test
	public void test() throws Exception
	{
		String url="http://localhost:"+port+"/stockexchangeall";
		System.out.println("Port is ::"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(null,headers);
		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.GET,entity,String.class);
		String expected="{\"id\":2,\"stockexchange\":\"hjyj\",\"contactaddress\":\"hj\",\"brief\":\"jggh\",\"remarks\":\"no\"}";
		System.out.println("TEST1:: Response Body :::: " +response.getBody());
		assertTrue(response.getBody().contains(expected));
	}
	@Test
	public void test1() throws Exception
	{
		String url="http://localhost:"+port+"/stockexchangeid/2";
		System.out.println("Port is ::"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<String>(null,headers);
		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.GET,entity,String.class);
		String expected="{\"id\":2,\"stockexchange\":\"hjyj\"";
		System.out.println("TEST1 :: Response Body :::: " +response.getBody());
		assertTrue(response.getBody().contains(expected));
	}
	@Test
	public void testadd() throws JSONException
	{
		String url="http://localhost:"+port+"/stockexchangeall";
		//System.out.println("Port is ::"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		StockExchange stockexchange=new StockExchange(175,"yy");
		HttpEntity<StockExchange> entity=new HttpEntity<StockExchange>(stockexchange,headers);
		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.POST,entity,String.class);
		String expected="\"id\":175,\"stockexchange\":\"yy\"";
		System.out.println("Test add :: Response Body :::: " +response.getBody());
		assertTrue(response.getBody().contains(expected));
	}
	@Test
	public void testupdate() throws JSONException
	{
		String url="http://localhost:"+port+"/updatestockexchange";
		//System.out.println("Port is ::"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		StockExchange stockexchange=new StockExchange(175,"ii");
		HttpEntity<StockExchange> entity=new HttpEntity<StockExchange>(stockexchange,headers);
		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.PUT,entity,String.class);
		String expected="\"id\":175,\"stockexchange\":\"ii\"";
		System.out.println("Test update :: Response Body :::: " +response.getBody());
		assertTrue(response.getBody().contains(expected));
	}
	@Test
	public void testdelete() throws JSONException
	{
		String url="http://localhost:"+port+"/deletestockexchange/170";
		//System.out.println("Port is ::"+url);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<StockExchange> entity=new HttpEntity<StockExchange>(null,headers);
		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.DELETE,entity,String.class);
		//String expected="\"id\":88,\"name\":\"nagasriRanjani\"";
		System.out.println("Test delete :: Response Body :::: " +response.getBody());
		assertEquals(HttpStatus.OK,response.getStatusCode());
	}
}