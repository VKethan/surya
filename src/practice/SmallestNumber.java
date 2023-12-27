package practice;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=1;
        int c=6;
        int result=a<b?(a<c?a:c):(b<c?b:c);
        int large=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(result);
        System.out.println(large);
	}

}
