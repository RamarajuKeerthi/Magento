package rr;

public class Palindrome_of_String {
	
	public static void main(String[] args)
	{
		
		String a = "amma";
		
		String result = "";
		
		for(int i = a.length()-1 ; i>=0; i--)
		{
		   result = result+a.charAt(i);
		}
		
		if(a.equals(result))
		{
			System.out.println(result +
					" "+ "is a Pallindrome");
		}
		else
		{
			System.out.println("Not a pallindrome");
		}
	}

}
