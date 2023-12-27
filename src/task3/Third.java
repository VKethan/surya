package task3;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="AAAAbbbccDDDDeeeeFFFFgggg";
        String a="";
        for(int i=0;i<s.length();i++)
        {
        	if(Character.isUpperCase(s.charAt(i)))
        		a+=Character.toLowerCase(s.charAt(i));
        	else if(Character.isLowerCase(s.charAt(i)))
        		a+=Character.toUpperCase(s.charAt(i));
        		
        }
        System.out.println(a);
	}

}
