package string;


public class Task3
{
	public static void main(String[] args) {
		
		String s="WWWPreethe";
		int i,j;
	    for(i=0;i<s.length();i=j)
	    {
	    	int count=1;
	    	for(j=i+1;j<s.length();j++)
	    	{
	    		if(s.charAt(i)==s.charAt(j))
	    		{
	    			count++;
	    		}
	    		else
	    		{
	    			break;
	    		}
	    	}
	    	System.out.print(s.charAt(i)+""+count);
	    }
		
	}
}