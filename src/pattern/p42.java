package pattern;

public class p42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=1;
        for(int i=1;i<=5;i++)
        {
        	int n=x;
        	for(int j=1;j<=5;j++)
        	{
        		if(j<=i)
        			System.out.print(n+++" ");
        	}
        	System.out.println();
        	x++;
        }
	}

}
