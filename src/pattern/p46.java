package pattern;

public class p46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2;
        for(int i=1;i<=5;i++)
        {
        	int n=k;
        	for(int j=1;j<=5;j++)
        	{
        		if(i>=j)
        		{
        			System.out.print(n+" ");
        			n=n+2;
        		}
        		
        	}
        	System.out.println();
        	
        	k*=2;
        }
	}

}
