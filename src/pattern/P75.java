package pattern;

public class P75 {
public static void main(String[] args) {
	int c=5;
	for(int i=1;i<=5;i++)
    {
    	for(int j=1;j<=5;j++)
    	{
    		if(i+j<=6)
    		{
    			System.out.print(c);
    			c--;
    		}
    		
    	}
    	c=5;
    	c=c+i;
    	System.out.println();
    }
}
}
