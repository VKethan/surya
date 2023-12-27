package practice;
import java.util.Scanner;
public class DecimalToHexaDecimal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		char b[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String c="";
        while(a>=1)
        {
        	int rem=a%16;
        	c=b[rem]+c;
        	a/=16;
        }
        System.out.println(c);
	}
}
