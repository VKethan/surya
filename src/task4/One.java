package task4;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaOfSquare(5);
		perimeterOfSquare(5);
		areaOfCircle(6);
		perimeterOfCircle(6);
		areaOfTriangle(3,4);
		perimeterOfTriangle(4,5,6);
	}
    public static void areaOfSquare(int a)
    {
    	System.out.println(a*a);
    }
    public static void perimeterOfSquare(int a)
    {
    	System.out.println(4*a);
    }
    public static void areaOfCircle(int r)
    {
    	System.out.println(3.14*r*r);
    }
    public static void perimeterOfCircle(int r)
    {
    	System.out.println(3.14*r*2);
    }
    public static void areaOfTriangle(int a,int b)
    {
    	System.out.println((a+b)/2);
    }
    public static void perimeterOfTriangle(int a,int b,int c)
    {
    System.out.println(a+b+c);	
    }
}
