package abstraction;
abstract class HP
{
	abstract void scan();
	abstract void print();
}
class windows extends HP
{
	public void print()
	{
		System.out.println("hp print");
		
	}

	@Override
	void scan() {
		// TODO Auto-generated method stub
		System.out.println("hp scan");
	}
}
class mac extends HP
{

	@Override
	void scan() {
		// TODO Auto-generated method stub
		System.out.println("mac scan");
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("mac print");
	}
	
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       mac obj1=new mac();
       HP obj2=obj1;
       obj2.print();
       windows obj4=new windows();
       HP obj5=obj4;
       obj5.scan();
	}

}
