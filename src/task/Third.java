package task;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
        for(int i=26;i<=70;i++)
        {
        	if(i%3==0)
        	{
        		sum+=i;
        		System.out.println(i);
        	}
        	 
        }
        System.out.println(sum);
	}

}
