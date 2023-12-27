package string;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
        String a = s.next();
        String answer=vow(a);
        System.out.println(answer);
        }
        
	}
public static String vow(String a)
{
	String vowels="";
    for(int i=0;i<a.length();i++)
    {
    	char c=a.charAt(i);
    	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
    	{
    		vowels+=c;
    	}
    }
    //System.out.println(vowels);
    int count1=1;
    int count2=1;
    for(int i=0;i<vowels.length()-1;i++)
    {
    	if(vowels.charAt(i)<vowels.charAt(i+1))
    	{
    		count1++;
    	}
    	else if(vowels.charAt(i)>vowels.charAt(i+1))
    		count2++;
    	
    }
    if(count1==vowels.length())
      return "Good";
    else if(count2==vowels.length())
    	return "Worst";
    else
    	return "Bad";
}
}
