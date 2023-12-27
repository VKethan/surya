package pattern;

public class P68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		int f=1;
        for(int i=1;i<=5;i++)
        {
        	int j=1;
        	for(j=1;j<=i;j++)
        	{
        		System.out.print(c);
        		c--;
       
        	}
        	System.out.println();
        	int d='A';
        	c=(char)(d+f++);
        }
	}

}
