package methodOverriding;
class Book
{
	String title;
	String price;
	Book(String title,String price)
	{
		this.price=price;
		this.title=title;
	}
	public int hashCode()
	{
		return price.hashCode()+title.hashCode();
	}
	public boolean equals(Object o)
	{
		Book b=(Book)o;
		if(this.price.equals(b.price)&&this.title.equals(b.title))
			return true;
		return false;
	}
	public String toString()
	{
		return title+"\n"+price;
	}
}
public class OverridingtoStringAndequalsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book o=new Book("marvel","50");
        Book b=new Book("marvel","50");
        System.out.println(o);
        System.out.println(o.equals(b));
        System.out.println(o.hashCode());
        System.out.println(b.hashCode());
        
	}

}
