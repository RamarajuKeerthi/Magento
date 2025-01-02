package rr;

public class qs {

	private static char result;

	public static void main(String[] args) {
		String e="wertyuiopoiuytrereeeeeeeeeee";
		int y=e.length();
		String result="";
		for (int i = 0; i < y; i++) 
		{
			if (e.charAt(i)!='e')
			{
				result= result+e.charAt(i);
			}
		}
		System.out.println("Word without a character E"+result.length());
	}

}
