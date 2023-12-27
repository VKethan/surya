package pattern;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		if(x%2!=0)
        			System.out.print(x);
        		x=x+2;
        	}
        	x=i+2;
        	System.out.println();
        	
        }
	}

}
