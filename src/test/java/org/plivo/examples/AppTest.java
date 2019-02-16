package org.plivo.examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.plivo.examples.BaseClass;

public class AppTest {
	
	BaseClass b;
	
	@Test
	public void runTest() throws Exception {
		
		b=new BaseClass();
		b.setDriver();
	}
	
	
 
}
