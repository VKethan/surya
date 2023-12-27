package string;

public class FirstAndLastCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="kethan";
        a=a.toLowerCase();
        String first=a.substring(0,1);
        first=first.toUpperCase();
        String last=a.substring(a.length()-1);
        last=last.toUpperCase();
        String rev=first+a.substring(1,a.length()-1)+last;
        System.out.println(rev);
	}
}
