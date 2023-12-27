package Array;

public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        String c="kkkeeettt";
        int count=0;
        String d="";
        for(int i=0;i<c.length();i++)
        {
        	for(int j=i+1;j<c.length();j++)
        	{
        		if(c.charAt(i)==c.charAt(j))
        			count++;
        	}
        	if(count>1)
        	{
        		if(d.indexOf(c.charAt(i))==-1)
        			d=d+c.charAt(i);
        	}
        }
        System.out.println(d);	
	}

}
