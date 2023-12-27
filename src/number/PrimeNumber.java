package number;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=2;
        int count=0;
        for(int i=1;i<=n;i++)
        {
        	if(n%i==0)
        		count++;
        }
        if(count==2)
        	System.out.println("yeah prime");
        else
        	System.out.println("no not prime");
	}

}
