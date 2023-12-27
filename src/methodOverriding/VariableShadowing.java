package methodOverriding;

public class VariableShadowing {
	int a=10;
public static void main(String[] args) {
	int a=20;
	VariableShadowing obj=new VariableShadowing();
	System.out.println(a);
	System.out.println(obj.a);
}
}
