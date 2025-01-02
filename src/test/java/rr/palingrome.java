package rr;

public class palingrome {

	public static void main(String[] args)
	{
		String e="amma";
		String revars="";
		for( int i=e.length()-1; i>=0;i--)
		{
			revars = revars+e.charAt(i);
		}
			
			if(e.equalsIgnoreCase(revars)) 
			{
				System.out.println("it is a palindrome"+" "+revars);
			}
			else
			{
				System.out.println("it in  not paloindrome");
			}
	    
	}

}
