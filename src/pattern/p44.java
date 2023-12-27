package pattern;

public class p44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		int d=2;
        for(int i=1;i<5;i++)
        {
        	k=i;
        	for(int j=1;j<5;j++)
        	{
        		if(i>=j)
        		{
        			System.out.print(k--);
        		}
        	}
        	System.out.println();
        	
        	k=k+d++;
        }
	}

}
