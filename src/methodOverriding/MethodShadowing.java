package methodOverriding;
class Laptop
{
	public static void config()
	{
		System.out.println("160 gb ram");
	}
}
class Laptop1 extends Laptop
{
	public static void config()
	{
		System.out.println("16gb ram");
	}
}
public class MethodShadowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Laptop obj=new Laptop1();
        obj.config();
	}

}
