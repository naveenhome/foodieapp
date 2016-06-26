package com.foodie;

import com.foodie.Largest;

import junit.framework.TestCase;

public class TestLargest extends TestCase{
	
	public void testCase() throws Exception
	{
		int [] arr = {4,5,6,3,2,8,2};
		Largest obj = new Largest();
		assertEquals(8, obj.find(arr));
	}

	public void testCase1() throws Exception
	{
		int [] arr = {4,9,6,3,2,8,2};
		Largest obj = new Largest();
		assertEquals(9, obj.find(arr));
	}
	public void testCase2() throws Exception
	{
		int [] arr = {-4,-9,-6,-3,-2,-8,-2};
		Largest obj = new Largest();
		assertEquals(-2, obj.find(arr));
	}
	public void testCase3()
	{
		try{
			
		
		int [] arr = {};
		Largest obj = new Largest();
		assertEquals(-2, obj.find(arr));
		fail();
		}catch(Exception ex)
		{
			assertTrue(true);
		}
	}
}
