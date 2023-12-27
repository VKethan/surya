package pattern;

public class p39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
        for(int i=1;i<=5;i++)
        {
        	int x=n;
        	for(int j=1;j<=5;j++)
        	{
        		if(j<=i)
        			System.out.print(x++);
        	}
        	n--;
        	System.out.println();
        }
	}

}
