package string;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello how how are you";
	    
	    String b[] =a.split(" ");
	    String c="";
	    for(int i =0;i<b.length;i++)
	    {
	        if(c.contains(b[i])==false)
	           c=c+b[i]+" ";
	           
	    }
	    System.out.println(c);
	}

}

