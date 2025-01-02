package rr;

import java.util.Iterator;

import org.w3c.dom.css.Counter;

public class Strings 
{

	public static void main(java.lang.String[] args) 
	{
		String s="munasalananaji";
		
		String result ="";
		
		
		int count=0;
		
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i)!='a' && s.charAt(i)!='n')
			{
				result = result+s.charAt(i);
			}
//			else if(s.charAt(i)!='n')
//			{
//				
//				
//			}
			
			
		}
		
			System.out.println("Word with out a character "+result.length());
			
	}	

}
