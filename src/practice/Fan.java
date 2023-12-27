package practice;

public class Fan {
	int cost;
	String brand;
	public Fan(int cost,String brand)
	{
		this.cost=cost;
		this.brand=brand;
	}
	public void print()
	{
		System.out.println(cost);
		System.out.println(brand);
	}
public static void main(String[] args) {
	Fan a=new Fan(70,"usha");
	a.print();
}
}
