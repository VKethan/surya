package practice;

public class OOPs {
	String name;
	int id;
    double percentage;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        OOPs a=new OOPs();
        a.name="laila";
        a.id=1;
        a.percentage=80.0;
        a.print();
        
        		
	}
    public  void print()
    {
    	System.out.println(name);
    	System.out.println(id);
    	System.out.println(percentage);
    }
}
