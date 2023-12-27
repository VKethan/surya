package string;
public class FrequencyOfcharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="keeethhhan";
       String s1=s.toUpperCase();
       char ch[]=s1.toCharArray();
       
       for(char i='A';i<='Z';i++) {
    	   int count=0;
    	   
    	   for(int j=0;j<ch.length-1;j++)
    	   {
    		   if(i==ch[j])
    			   count++;
    	   }
    	   if(count>1)
    	      System.out.println(i+"-->"+count);
       }
       
       
	}

}
