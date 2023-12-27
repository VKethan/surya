package practice;

public class UpCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		A obj2=obj;
		B obj3=(B)obj2;
		System.out.println(obj3.a);
		System.out.println(obj3.b);
		System.out.println(obj3.c);
		System.out.println(obj3.d);
		
	}

}
class A
{
	int a=10;
	int b=20;
}
class B extends A
{
	int c=30;
	int d=40;
}

