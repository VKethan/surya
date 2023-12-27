package pattern;

public class P79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=17;
		int d=6;
        for(int i=1;i<5;i++)
        {
        	for(int j=1;j<5;j++)
        	{
        		if(i+j<=5)
        		{
        			System.out.print(c+++" ");
        			
        		}
        	}
        	System.out.println();
        	
        	c=c-d;
        	d-=2;
        	
        }
	}

}
