package pattern;

public class P63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++)
        {
        	for(int j=1;j<=i;j++)
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
        	System.out.println();
	}
	}
}
