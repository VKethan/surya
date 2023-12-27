package string;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="kkeethan";
        String b="";
        for(int i=0;i<a.length();i++)
        {
        	int count=0;
        	if(b.indexOf(a.charAt(i))==-1)
        	{
        		b=b+a.charAt(i)+"";
        		for(int j=0;j<a.length();j++)
            	{
            		if(a.charAt(i)==a.charAt(j))
                			count++;
            	}
        	}
        	
        	if(count>1)
        		System.out.println(a.charAt(i)+"-->"+count);
        }
        
	}
	

}
