package com.genericsprograms;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;



public class TC11 {
	@SuppressWarnings("deprecation")
	@Test  
    public void testFindMax(){  
		UC1_UC2 me = new UC1_UC2();
		int output = me.maxInt(5);
		float output1 = me.maxFloat(2);
		assertEquals(20, output);
		assertEquals(20, output1,3);
}
}
