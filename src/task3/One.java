package task3;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
        System.out.println(strong(n));
	}
    public static boolean strong(int n)
    {
    	int temp=n;
    	int sum=0;
    	
    	while(n!=0)
    	{
    		int rem = n%10;
    		int a=1;
    		for(int i=1;i<=rem;i++)
    		{
    			a=a*i;
    	    }
    		//System.out.println(a);
    		n/=10;
            sum+=a;
    	}
    	//System.out.println(sum);
    	if(sum==temp)
    		return true;
    	else
    		return false;
    }
}
