package pattern;

public class P93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==============");
        char god='E';
        for(int i=1;i<=5;i++)
        {
        	char god1=god;
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j<=6)
        			System.out.print(god1+++" ");
        	}
        	System.out.println();
        	god--;
        }
        
        	System.out.println("==============");
        	System.out.println("==============");
            char c='A';
            for(int i=1;i<=5;i++)
            {
            	
            	for(int j=1;j<=5;j++)
            	{
            		if(i>=j)
            			System.out.print(c+++" ");
            	}
            	System.out.println();
            	
            }
            
            	System.out.println("==============");
	}

}
