package practice;
import java.util.Scanner;
public class OddRecursion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        odd(n);
	}
    public static void odd(int n)
    {
    	while(n>=0)
    	{
    		if(n%2!=0)
    	    	  System.out.println(n);
    	    odd(n-1);
    	}
    	
    }
}
