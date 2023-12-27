package number;

public class Peterson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=145;
        int temp=a;
        int b=0;
        while(a!=0)
        {
        	int d = a%10;
        	b=b+fact(d);
        	//System.out.println(fact(d));
        	//System.out.println(b);
        	a/=10;
        }
        if(b==temp)
        	System.out.println("peterson");
        
        else
        	System.out.println("not peterson");
	}
    public static int fact(int n)
    {
    	int fact = 1;
    	for(int i=1;i<=n;i++)
    	{
    		fact=fact*i;
    	}
    	return fact;
    }
}
