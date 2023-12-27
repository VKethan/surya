package string;

public class ReverseHalfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="kethan";
        String b=a.substring(a.length()/2);
        String rev=a.substring(0,a.length()/2);
        for(int i=b.length()-1;i>=0;i--)
        {
        	rev=rev+b.charAt(i);
        }
        System.out.println(rev);
	}
}
