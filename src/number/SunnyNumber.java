package number;

public class SunnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=10;
        ++n;
        int count1=0;
        
        System.out.println(n);
        for(int i=1;i<=n;i++)
        {
        	if(n/i==i&&n%i==0)
        	{
        		
        		count1++;
        	}
        	
        }
        if(count1>0)
        {
        	System.out.println("sunny");
        }
        else
        	System.out.println("not sunny");
	}

}
