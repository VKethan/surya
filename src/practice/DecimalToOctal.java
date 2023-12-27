package practice;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		char b[]= {'0','1','2','3','4','5','6','7'};
		String c="";
        while(a>=1)
        {
        	int rem=a%8;
        	c=b[rem]+c;
        	a/=8;
        }
        System.out.println(c);
	}

}
