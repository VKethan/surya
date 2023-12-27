package practice;

public class PetersonNumber {
	public static int fact(int n)
    {
    	int fact=1;
    	for(int i=1;i<=n;i++)
    	{
    		fact=fact*i;
    	}
    	return fact;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=145;
        int temp=n;
        int sum=0;
        while(n>0)
        {
        	int rem=n%10;
        	sum=sum+fact(rem);
        	n=n/10;
        }
        if(sum==temp)
        	System.out.println("peterson");
        else 
        	System.out.println("not peterson");
	}

}
