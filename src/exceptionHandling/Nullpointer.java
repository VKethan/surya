package exceptionHandling;

public class Nullpointer {
	public static void main(String[] args) {
		String s=null;
		try
		{
			System.out.println(s.charAt(4));
		}
	    catch(NullPointerException e)  
		{
	    	 System.out.println("handled");
		}
	}
}
