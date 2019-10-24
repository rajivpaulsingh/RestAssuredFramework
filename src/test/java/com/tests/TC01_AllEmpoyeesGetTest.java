package com.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.base.TestBase;

public class TC01_AllEmpoyeesGetTest extends TestBase {
	
	@Test(priority=1)
	public void statusCodeTest() {
		int res=getResponse("employees").getStatusCode();
		log("Status Code :"+res);
		Assert.assertEquals(res, 200);
		
		
	}
	
	@Test(priority=2)
	public void responseTest() {
	
		log("Response :"+getResponse("employees").getBody().asString());	
		
	}
	
	@Test(priority=3)
	public void statusLineTest() {
	
		log("Status Line :"+getResponse("employees").getStatusLine());	
		
	}
	
	@Test(priority=4)
	public void contentTypeTest() {
	
		log("Content Type :"+getResponse("employees").getContentType());	
		
	}
	
	@Test(priority=5)
	public void headersTest() {
	
		log("Headers :"+getResponse("employees").getHeaders());	
		
	}

	


}
