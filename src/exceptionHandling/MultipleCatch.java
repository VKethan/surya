package exceptionHandling;
import java.util.*;
public class MultipleCatch {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number:");
		int a=s.nextInt();
		int b=0;
		try
		{
			 b=a/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
}
