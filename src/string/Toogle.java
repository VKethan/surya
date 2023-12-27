package string;

public class Toogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="KeThAn";
        String rev="";
        for(int i=0;i<s.length();i++)
        {
        	if(Character.isUpperCase(s.charAt(i)))
        		rev=rev+Character.toLowerCase(s.charAt(i));
        	else
        		rev=rev+Character.toUpperCase(s.charAt(i));
        }
        System.out.println(rev);
	}

}
