package number;

public class XylemAndPhloem {

	public static void main(String[] args) {
		int num=761312;
		int temp=num;
		int sum1=0;
		int sum2=0;
		while(num!=0)
		{
			if(temp==num||num<=9)
			{
				int d = num%10;
				sum1+=d;
			}
			else
			{
				int d = num%10;
				sum2+=d;
			}
			num/=10;
		}
		System.out.println(sum1+"and"+sum2);
		if(sum1==sum2)
			System.out.println("xylem");
		else
			System.out.println("phloem");
	}

}
