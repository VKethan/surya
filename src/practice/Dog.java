package practice;

public class Dog {

	String breed;
	String name;
	String color;
	public static void main(String[] args) {
        Dog d=new Dog("brad","sampu","white");
        d.print();
        Dog d2=new Dog("golden retriver","chimtu");
        d2.print();
	}
    Dog(String breed,String name)
    {
    	this.name=name;
    	this.breed=breed;
    }
    Dog(String breed,String name,String color)
    {
    	this(breed,name);
    	this.color=color;
    }
    public void print()
    {
    	System.out.println("======");
    	System.out.println("the breed:"+breed);
    	System.out.println("the name:"+name);
    	System.out.println("the color:"+color);
    	System.out.println("======");
    }
}
