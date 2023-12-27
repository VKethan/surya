package practice;

import java.util.Scanner;

public class HexaDecimalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        String b=s.next();
        int a=Integer.parseInt(b);
        int sum=0;
        for(int i=0;i<=b.length()-1;i++)
        {
        	int rem=a%10;
        	sum=(sum+rem*(int)Math.pow(16,i))-55;
        	a=a/10;
        }
        System.out.println(sum);
	}
}
