package com.shibuyaxpress.lab11.junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
   {
	@Test
	public void testSuma() {		
		App app = new App();		
		Assert.assertEquals(app.suma(4, 3), 7);
	}
	
	@Test
	public void testResta() {
		App app = new App();		
		Assert.assertEquals(app.resta(4, 3), 1);		
	}
	
	@Test
	public void testMessageReceived() {
		App app=new App();
		Assert.assertEquals(app.messageReceived("hi"), "how are you?");
	}

}
