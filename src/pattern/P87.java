package pattern;

public class P87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j<=6)
        			System.out.print(c+++" ");
        	}
        	System.out.println();
        	c='A';
        }
        System.out.println("=============");
        char g='E';
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j<=6)
        			System.out.print(g+" ");
        	}
        	System.out.println();
        	g--;
	} 
        System.out.println("==============");
        char gh='E';
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j<=6)
        			System.out.print(gh--+" ");
        	}
        	System.out.println();
        	gh='E';
        }
        System.out.println("==============");
        char ghe='E';
        for(int i=1;i<=5;i++)
        {
        	char ghef=ghe;
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j<=6)
        			System.out.print(ghef--+" ");
        	}
        	System.out.println();
        	ghe--;
        	
        }
        System.out.println("==============");
        char god='E';
        for(int i=1;i<=5;i++)
        {
        	char god1=god;
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j<=6)
        			System.out.print(god1--+" ");
        	}
        	System.out.println();
        	god++;
        	
        }
	}
}
