package com.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.base.TestBase;

public class TC05_DeleteEmpoyeeTest extends TestBase {
	
//	@Test(priority=1)
//	public void statusCodeTest() {
//		int res=getResponse("employees").getStatusCode();
//		log("Status Code :"+res);
//		Assert.assertEquals(res, 200);
//		
//	}
	
	@Test(priority=2)
	public void responseTest() {
	
		//String Payload= "{\\r\\n\\t\\t\\\"employee_name\\\":\\\"Madhur\\\",\\r\\n\\t\\t\\\"employee_salary\\\":\\\"50000\\\",\\r\\n\\t\\t\\\"employee_age\\\":\\\"27\\\"\\r\\n\\t\\t\\r\\n\\t}";
		log("Response :"+deleteResponse("delete/60567").getBody().asString());	
		
	}
	
//	@Test(priority=3)
//	public void statusLineTest() {
//	
//		log("Status Line :"+getResponse("employees").getStatusLine());	
//		
//	}
//	
//	@Test(priority=4)
//	public void contentTypeTest() {
//	
//		log("Content Type :"+getResponse("employees").getContentType());	
//		
//	}
//	
//	@Test(priority=5)
//	public void headersTest() {
//	
//		log("Headers :"+getResponse("employees").getHeaders());	
//		
//	}

	
	


}
