package pattern;

public class P85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j<=6)
        		{
        			if(i%2!=0)
        			{
        				if(j%2!=0)
        					System.out.print("0");
        				else
        					System.out.print("1");
        			}
        			else
            		{
            			
            			
            				if(j%2!=0)
            				  System.out.print("1");
            				else
            					System.out.print("0");
            			
            		}
        		}
        		
        	}
        	System.out.println();
        }
	}

}
