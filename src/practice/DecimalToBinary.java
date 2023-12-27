package practice;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
        
      Scanner s= new Scanner(System.in);
      int n=s.nextInt();
      String b="";
      while(n>0)
      {
    	  int d=n%2;
    	  b=b+d;
    	  n=n/2;
      }
      System.out.println(b);
	}
}
