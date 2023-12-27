package practice;

public class Hero {
 
	int noe;
	String ceo;
	Hero()
	{}
	Hero(String ceo,int noe)
	{
		this.ceo=ceo;
		this.noe=noe;
	}
	public void printParent()
	{
		System.out.println(ceo);
		System.out.println(noe);
	}
	

}
class Splendor extends Hero
{
	double milage;
	double cc;
	public Splendor(double milage,double cc)
	{
		this.milage=milage;
		this.cc=cc;
	}
	public void printChild()
	{
		System.out.println(milage);
		System.out.println(cc);
		System.out.println(ceo);
		System.out.println(noe);
	}
}