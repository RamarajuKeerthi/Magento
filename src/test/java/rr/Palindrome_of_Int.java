package rr;

import java.util.List;

public class Palindrome_of_Int {
	public static void main(String[] args)
	{
		int a = 121;
		
		int result = 0;
		
		int n = a;
		
		while(n!=0)
		{
			int c = n%10;
			result = result*10+c;
			
			n = n/10;
		}
		
		if(result ==a)
		{
			System.out.println("Num is a pallindrome");
		}
		else
		{
			System.out.println(result);
		}
		
	}

	

	
}
