package string;

public class String11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="a3b5c3";
        String b="";
        for(int i=0;i<a.length()-1;i+=2)
        {
        	char c1=a.charAt(i);
        	char c2=a.charAt(i+1);
        	if((c1>=97&&c1<=122)&&(c2>='0'&&c2<='9'))
        	{
        		
        		int d=c2-'0';
        		System.out.println(d);
        		for(int j=1;j<=d;j++)
        		{
        			b+=c1;
        		}
        	}
        }
        System.out.println(b);
        kethan();
	}
	public static void kethan()
    {
    	int g;
    	//g=1+2;
    	//System.out.println(g);
    }
}
