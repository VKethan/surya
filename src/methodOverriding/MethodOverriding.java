package methodOverriding;
class FB
{
	public void status()
	{
		System.out.println("active");
	}
}
class FB1 extends FB
{
	public void status()
	{
		System.out.println("inactive");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FB obj = new FB1();
        obj.status();
	}

}
