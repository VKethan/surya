package string;

public class SwappingTwoStringsWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a="ok";
       String b="bye";
       a=a+b;
       b=a.substring(0,a.length()-b.length());
       a=a.substring(b.length());
       System.out.println(a);
       System.out.println(b);
       sum(10,20);
	}
	public static void sum(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
}
