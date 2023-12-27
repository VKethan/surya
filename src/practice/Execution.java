package practice;

public class Execution {
  
	static int a=test();
	static int b=test()+demo();
	public static int test()
	{
		return 10;
	}
 public static int demo()
 {
	 a=23;
	 return 20+test();
 }
 static
 {
	 b=-24;
 }
 public static void main(String[] args) {
	System.out.println("a:"+a);
	System.out.println("b:"+b);
}
}
