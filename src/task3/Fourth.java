package task3;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
        for(int i=5;i<=35;i++)
        {
        	int count=0;
        	for(int j=1;j<=i;j++)
        	{
        		if(i%j==0)
        			count++;
        	}
        	if(count==2)
        		sum+=i;
        	
        }
        System.out.println(sum);
	}

}
