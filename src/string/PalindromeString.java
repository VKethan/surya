package string;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a="pop";
       String b="";
       for(int i=a.length()-1;i>=0;i--)
       {
    		  b=b+a.charAt(i); 
       }
       System.out.println(b);
       if(b.equalsIgnoreCase(a))
    	   System.out.println("palindome");
       else
    	   System.out.println("not palindrome");
	}

}
