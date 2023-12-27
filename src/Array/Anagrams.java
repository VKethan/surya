package Array;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="abc";
        String s2="cad";
        if(s1.length()==s2.length())
        {
        	int count=0;
        	s1=s1.toLowerCase();
        	s2=s2.toLowerCase();
        	char ch1[]=s1.toCharArray();
        	char ch2[]=s2.toCharArray();
        	Arrays.sort(ch1);
        	Arrays.sort(ch2);
        	for(int i=0;i<ch1.length;i++)
        	{
        		if(ch1[i]!=ch2[i])
        			count++;
        	}
        	if(count>0)
        		System.out.println("not anagrams");
        	else
        		System.out.println("angrams");
        }
        else
        	System.out.println("not anagrams");
	}

}
