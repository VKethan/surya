package task3;

public class Third2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="AAAAbbbccDDDDeeeeFFFFgggg";
        String n="";
        for(int i=0;i<s.length();i++)
        {
        	char c =s.charAt(i);
        	if(c>=65&&c<=90)
        	{
        		n+=(char)(c+32);
        	}
        	else if(c>=97&&c<=122)
        	{
        		n+=(char)(c-32);
        	}
        		
        }
        System.out.println(n);
	}

}
