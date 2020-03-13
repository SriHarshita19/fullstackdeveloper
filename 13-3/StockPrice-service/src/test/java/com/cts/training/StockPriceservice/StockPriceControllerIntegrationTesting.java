//package com.cts.training.StockPriceservice;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import java.util.Arrays;
//
//import org.codehaus.jettison.json.JSONException;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//
//import com.netflix.ribbon.proxy.annotation.Http;
//@SpringBootTest(classes=StockPriceServiceApplication.class , webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@ExtendWith(SpringExtension.class)
//public class StockPriceControllerIntegrationTesting {
//	@LocalServerPort
//	private int port;
//	HttpHeaders headers=new HttpHeaders();
//	TestRestTemplate restTemplate=new TestRestTemplate();
//	@Test
//	public void test() throws Exception
//	{
//		String url="http://localhost:"+port+"/stockpriceall";
//		System.out.println("Port is ::"+url);
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity=new HttpEntity<String>(null,headers);
//		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.GET,entity,String.class);
//		String expected="{\"id\":71,\"name\":\"dd\",\"address\":\"dddss\"";
//		System.out.println("TEST1 :: Response Body :::: " +response.getBody());
//		assertTrue(response.getBody().contains(expected));
//	}
//	

//	@Test
//	public void test1() throws Exception
//	{
//		String url="http://localhost:"+port+"/stockpriceid/71";
//		System.out.println("Port is ::"+url);
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity=new HttpEntity<String>(null,headers);
//		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.GET,entity,String.class);  
//		String expected="{\"id\":71,\"name\":\"dd\"";
//		System.out.println("TEST1 :: Response Body :::: " +response.getBody());
//		assertTrue(response.getBody().contains(expected));
//	}
//	@Test
//	public void testadd() throws JSONException
//	{
//		String url="http://localhost:"+port+"/stockexchangeall";
//		//System.out.println("Port is ::"+url);
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		StockPrice stockprice=new StockPrice(88,"nagasri");
//		
//		HttpEntity<StockPrice> entity=new HttpEntity<StockPrice>(stockprice,headers);
//		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.POST,entity,String.class);  
//		String expected="\"id\":88,\"name\":\"nagasri\"";
//		System.out.println("Test add :: Response Body :::: " +response.getBody());
//		assertTrue(response.getBody().contains(expected));
//	}
//	@Test
//	public void testupdate() throws JSONException
//	{
//		String url="http://localhost:"+port+"/updatestockexchange";
//		//System.out.println("Port is ::"+url);
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		StockPrice stockprice=new StockPrice(100,"sriR");
//		
//		HttpEntity<StockPrice> entity=new HttpEntity<StockPrice>(stockprice,headers);
//		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.PUT,entity,String.class);  
//		String expected="\"id\":100,\"name\":\"sriR\"";
//		System.out.println("Test update :: Response Body :::: " +response.getBody());
//		assertTrue(response.getBody().contains(expected));
//	}
//	@Test
//	public void testdelete() throws JSONException
//	{
//		String url="http://localhost:"+port+"/deletestockexchange/101";
//		//System.out.println("Port is ::"+url);
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		
//		
//		HttpEntity<StockPrice> entity=new HttpEntity<StockPrice>(null,headers);
//		ResponseEntity<String> response=restTemplate.exchange(url,HttpMethod.DELETE,entity,String.class);  
//		//String expected="\"id\":88,\"name\":\"nagasriRanjani\"";
//		System.out.println("Test delete :: Response Body :::: " +response.getBody());
//	
//		assertEquals(HttpStatus.OK,response.getStatusCode());
//	}
//}
