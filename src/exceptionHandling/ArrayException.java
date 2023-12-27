package exceptionHandling;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try
     {
    	 int a[]= {2,1,3,4};
    	 System.out.println(a[5]);
     }
     catch(ArrayIndexOutOfBoundsException e)
     {
    	 System.out.println("handled");
     }
	}

}
