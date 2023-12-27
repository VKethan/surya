package pattern;

public class p43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=1;
        for(int i=1;i<=5;i++)
        {
        	int n=x;
        	for(int j=1;j<=5;j++)
        	{
        		
        		if(j<=i)
        		{
        			System.out.print(n+" ");
    			    n=n+2;	
        		}
        		else
        			System.out.print(" ");
        		x+=2;
        	}
        	System.out.println();
        }
	}

}
