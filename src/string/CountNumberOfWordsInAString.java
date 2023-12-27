package string;

public class CountNumberOfWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a=" hi my name          is kethan ";
        a=a.trim();
        int count=1;
        for(int i=0;i<a.length();i++)
        {
        	if(a.charAt(i)==' ' && a.charAt(i+1)!=' ')
        		count++;
        		
        }
        System.out.println(count);
        
	}

}
