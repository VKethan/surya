package string;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuilder s=new StringBuilder("hai");
        StringBuilder s1=new StringBuilder("hai");
        System.out.println(s1);
        System.out.println(s1==s);
        System.out.println(s1.equals(s));
        s1.append(" "+s);
        System.out.println(s1);
	}

}
