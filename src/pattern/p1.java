package pattern;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=0;i<5;i++)
        {
        for(int j=0;j<5;j++)
        {
        	if(i+j<5)
        		System.out.print("*");
        	else
        		System.out.print(" ");
        }
        System.out.println();
        }
        System.out.println("===========");
        
        for(int i=1;i<=5;i++)
	    {
        	int a=1;
	        for(int j=1;j<=5;j++)
	        {
	            if(i<=j)
	            {
	            	System.out.print(a);
		            a++;
	            }
	              
	        }
	        System.out.println();
	    }
	}

}
