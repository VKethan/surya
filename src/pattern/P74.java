package pattern;

public class P74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=5;
		for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j<=6)
        		{
        			System.out.print(c);
        			c--;
        		}
        		
        	}
        	c=5;
        	
        	System.out.println();
        }
	}

}
