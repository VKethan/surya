package practice;

public class FibbonaciusingRecursion {
	static int n1=0,n2=1,n3;
    public static void print(int count)
    {


    	if(count>0)
    	{
    		n3=n1+n2;
    		n1=n2;
    		n2=n3;
    		System.out.print(" "+n3);
    		print(count-1);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print(n1+" "+n2);
		print(10-2);
	}

}
