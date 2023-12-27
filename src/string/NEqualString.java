package string;
import java.util.Scanner;
public class NEqualString {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter n ");
	int n=s.nextInt();
	int m=n;
	String a="kethankethan";
	if(a.length()%n==0)
	{
		for(int i=0;i<a.length();i=i+m)
		{
			String s1="";
			for(int j=i;j<n;j++)
			{
				s1=s1+a.charAt(j);
			}
			System.out.println(s1);
			n=n+m;
		}
	}
	else
		System.out.println("we can't divide the string");
}
}
