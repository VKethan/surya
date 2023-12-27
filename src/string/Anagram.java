package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="god";
        String b="dog";
        String c=a.toLowerCase();
        String d=b.toLowerCase();
        char ch1[]=c.toCharArray();
        char ch2[]=d.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int i = 0;
        if(ch1.length==ch2.length)
        {
        	for(i=0;i<ch1.length;i++)
            {
            	if(!(ch1[i]==ch2[i]))
            	{
            		
            		break;
            	}
            }
        }
        System.out.println(i);
        if(i==ch1.length)
        	System.out.println("yeah anagrams");
        else
        	System.out.println("not  anagrams");
        	

	}

}
