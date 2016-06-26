package com.foodie;

import java.util.Stack;

public class RPNCalc {

	public int calculate(String expr) throws Exception {
		// TODO Auto-generated method stub
		
		if(expr.isEmpty()||expr.equals(" "))
		{
			throw new Exception ("Expr can't be Empty");
		}
		String []input = expr.split(",");
		Stack<String> rpnStack = new Stack<String>();
		for(int i=0; i<input.length;i++)
		{
			if(input[i].equals("+"))
			{
				int secondValue = Integer.valueOf(rpnStack.pop());
				int firstvalue= Integer.valueOf(rpnStack.pop());
				rpnStack.push(String.valueOf(firstvalue+secondValue));
			}
			else
			{
				rpnStack.push(input[i]);
			}
		}
		
		
		return Integer.valueOf(rpnStack.pop());
	}

}
