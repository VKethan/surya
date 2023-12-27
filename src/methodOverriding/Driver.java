package methodOverriding;
class Board
{
	String color="yellow";
	int size=10;
	String shape="square";
	public String toString()
	{
		return color+"\n"+size+"\n"+shape;
	}
	
	
}
public class Driver extends Board {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Board b=new Board();
      System.out.println(b);
	}

}
