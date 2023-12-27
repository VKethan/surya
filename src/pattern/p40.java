package pattern;

public class p40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)
        {
        	int x=2;
        	for(int j=1;j<=5;j++)
        	{
        		if(j<=i)
        			System.out.print(x+" ");
        		x=x+2;
        	}
        	System.out.println();
        }
	}

}
