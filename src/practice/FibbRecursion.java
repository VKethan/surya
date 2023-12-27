package practice;
import java.util.Scanner;
public class FibbRecursion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("fibbonaci series upto "+n+" numbers");
        for(int i=0;i<n;i++)
        {
        	System.out.print(fibb(i)+" ");
        }
	}
    public static int fibb(int n)
    {
    	if(n==0)
    		return 0;
    	else if(n==1||n==2)
    	    return 1;
    	else
    		return fibb(n-2)+fibb(n-1);
    }
}
