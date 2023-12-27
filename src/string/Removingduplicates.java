package string;

public class Removingduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Selenium";
	       String s1=s.toLowerCase();
	       char ch[]=s1.toCharArray();
	       String dup="";
	       String lost="";
	       for(char i='a';i<='z';i++) {
	    	   int count=0;
	    	   
	    	   for(int j=0;j<ch.length-1;j++)
	    	   {
	    		   if(i==ch[j])
	    			   count++;
	    	   }
	    	   if(count>1)
	    	      dup+=i;
	       }
	       System.out.println(dup);
	       for(int i=0;i<s.length();i++)
	       {
	    	   if(dup.indexOf(s.charAt(i))==-1)
	    		   lost+=s.charAt(i);
	       }
	       System.out.println(lost);
	}

}
