package pattern;

public class p36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)
        {
        	int a=1;
        	for(int j=1;j<=5;j++)
        	{
        		if(j<=i)
        		{
        			System.out.print(a++);
        		}
        	}
        	System.out.println();
        }
	}

}