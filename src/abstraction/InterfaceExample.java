package abstraction;
interface shapes
{
	int area(int l,int b);
	 

}
class Triangle implements shapes
{

	@Override
	public int area(int l,int b) {
		// TODO Auto-generated method stub
		System.out.println("triangle");
		return l*b;
	}
	
}
abstract class Rectangle implements shapes
{
	
}
public class InterfaceExample {
public static void main(String[] args) {
	shapes obj=new Triangle();
}
}
