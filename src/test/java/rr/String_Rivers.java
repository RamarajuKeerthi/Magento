package rr;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class String_Rivers
{

	public static void main(String[] args)
	{
		String r = "Ramaraju swami mani";
		String [] split =r.split("");
		String rev="";
		for (int i = split.length-1; i>=0; i--) 
		{
			rev= rev + split[i]+"";
		}
			System.out.println(rev);
	}

}
