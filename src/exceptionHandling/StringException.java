package exceptionHandling;

public class StringException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ke";
	try
	{
		System.out.println(a.charAt(4));
	}
    catch(StringIndexOutOfBoundsException e)  
	{
    	 System.out.println("handled");
	}
       
	}

}
