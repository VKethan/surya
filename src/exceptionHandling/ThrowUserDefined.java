package exceptionHandling;

public class ThrowUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        if(a>=18)
        	System.out.println("can vote");
        else
        	throw new NotEligible("no not possible");
        
	}

}
class NotEligible extends RuntimeException
{
	public NotEligible(String msg)
	{
		System.out.println(msg);
	}
}