package practice;

public class Bike {
    int price;
    String color;
    String brand;
    String name;
    int model;
    public Bike(int price,String color,String brand,String name,int model)
    {
    	this.price=price;
    	this.brand=brand;
    	this.color=color;
    	this.name=name;
    	this.model=model;
    }
    public Bike(int price,String color,String name)
    {
    	this.price=price;
    	
    	this.color=color;
    	this.name=name;
    	
    }
    public Bike(String brand,String name)
    {
    	
    	this.brand=brand;
    	
    	this.name=name;
    	
    }
    
    public void print()
    {
    	System.out.println(price);
    	System.out.println(brand);
    	System.out.println(color);
    	System.out.println(name);
    	System.out.println(model);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bike obj=new Bike("bajaj","pulsar");
      obj.print();
      System.out.println("===========");
      Bike obj2=new Bike(10,"black","pulsar");
      obj2.print();
      System.out.println("===========");
      Bike obj3=new Bike(10,"black","bajaj","pulsar",150);
      obj3.print();
      System.out.println("===========");
	}

}
