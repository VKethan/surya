package task;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String sentence="Advanced Selenium";
        String a[]=sentence.split(" ");
        String reverse = "";
        for(int i=0;i<a.length;i++)
        {
        	String word = a[i];
        	for(int j=word.length()-1;j>=0;j--)
        	{
        		reverse+=word.charAt(j);
        	}
        	reverse+=" ";
        }
        System.out.println(reverse);
	}

}
