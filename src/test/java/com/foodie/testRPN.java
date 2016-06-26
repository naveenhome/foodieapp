package com.foodie;

import static org.junit.Assert.*;

import org.junit.Test;

import com.foodie.RPNCalc;

import junit.framework.Assert;

public class testRPN {
	
	@Test
	public void addtionPositive() throws Exception
	{
		String expr = "3,2,+";
		RPNCalc obj = new RPNCalc();
		Assert.assertEquals(5, obj.calculate(expr));
	}
	@Test
	public void addtionPositive2() throws Exception
	{
		String expr = "5,2,+";
		RPNCalc obj = new RPNCalc();
		Assert.assertEquals(7, obj.calculate(expr));
	}
	@Test
	public void CheckEmpty()
	{
		try{
			
		String expr = " ";
		RPNCalc obj = new RPNCalc();
		int result = obj.calculate(expr);
		fail();
		}catch(Exception ex)
		{
			assertEquals("Expr can't be Empty", ex.getMessage());
		}
	}
	@Test
	public void CheckBinaryOperator()
	{
		try{
			
		String expr = "2,+";
		RPNCalc obj = new RPNCalc();
		int result = obj.calculate(expr);
		fail();
		}catch(Exception ex)
		{
			assertEquals("Expr can't be Empty", ex.getMessage());
		}
	}
	@Test
	public void addtionPositive3() throws Exception
	{
		String expr = "3,2,+,4,+";
		RPNCalc obj = new RPNCalc();
		Assert.assertEquals(9, obj.calculate(expr));
	}
	@Test
	public void CheckBinaryOperator1()
	{
		try{
			
		String expr = "2,3,+,4";
		RPNCalc obj = new RPNCalc();
		int result = obj.calculate(expr);
		fail();
		}catch(Exception ex)
		{
			assertEquals("Expr can't be Empty", ex.getMessage());
		}
	}
}
