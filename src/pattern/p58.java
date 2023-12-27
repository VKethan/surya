package pattern;

public class p58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,r=0;
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		if(j<=i)
        		{
        			a=b;
        			b=r;
        			System.out.print(r+" ");
        			r=a+b;
        		}
        	}
        	System.out.println();
        	a=0;
        	b=1;
            r=0;
        }
	}

}
