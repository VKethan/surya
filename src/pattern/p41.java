package pattern;

public class p41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
        for(int i=1;i<5;i++)
        {
        	for(int j=1;j<5;j++)
        	{
        		if(j<=i)
        	       System.out.print(x+++" ");
        	}
        	System.out.println();
        }
	}

}
