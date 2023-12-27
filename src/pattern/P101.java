package pattern;

public class P101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int x=2;
        for(int i=1;i<=5;i++)
        {
        	int b=a;
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j>=6)
        		{
        			System.out.print(" "+b);
        			b+=2;
        		}
        		else
        			System.out.print(" ");
        	}
        	System.out.println();
        	a=a+x;
        }
	}

}
