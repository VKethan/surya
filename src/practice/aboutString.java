package practice;

public class aboutString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1=new String(new StringBuffer("kethan"));
     System.out.println(s1);
     String s2=new String(new StringBuilder("roy"));
     System.out.println(s2);
     System.out.println(s1 instanceof String);
     System.out.println(s2 instanceof String);
	}

}
