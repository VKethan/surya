package string;

public class RemovingDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="hi hi joy joy";
        String n="";
        String b[]=a.split(" ");
        for(int i=0;i<b.length;i++)
        {
        	if(n.contains(b[i])==false)
        		n=n+b[i]+" ";
        }
        System.out.println(n);
	}

}
