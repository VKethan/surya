package pattern;

public class P95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j>=6)
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	}
        	System.out.println();
        }
        System.out.println("2=======");
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j>=6)
        			System.out.print(j);
        		else
        			System.out.print(" ");
        	}
        	System.out.println();
        }
        System.out.println("3=======");
        
        for(int i=1;i<=5;i++)
        {
        	int a=1;
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j>=6)
        			System.out.print(a++);
        		else
        			System.out.print(" ");
        	}
        	System.out.println();
        }
        System.out.println("4=======");
        int b=1;
        for(int i=1;i<=5;i++)
        {
        	
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j>=6)
        			System.out.print(b);
        		else
        			System.out.print(" ");
        	}
        	b++;
        	System.out.println();
        }
        System.out.println("5=======");
        int c=5;
        for(int i=1;i<=5;i++)
        {
        	
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j>=6)
        			System.out.print(c);
        		else
        			System.out.print(" ");
        	}
        	c--;
        	System.out.println();
        }
        System.out.println("6=======");
        int d=1;
        for(int i=1;i<=5;i++)
        {
            int e=d;	
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j>=6)
        			System.out.print(e--);
        		else
        			System.out.print(" ");
        	}
        	d++;
        	System.out.println();
        }
	}

}
