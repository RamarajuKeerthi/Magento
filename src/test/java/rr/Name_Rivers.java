package rr;

import java.util.Iterator;

public class Name_Rivers
{
	public static void main(String[] args)
	{
		String r = "ramaraju";
		 int s=r.length();
		 
		 String e="";
		
		for (int i =s-1; i>=0; i--)
		{
			e =e+ r.charAt(i);
		}
		System.out.println(e);
	}
	
}
