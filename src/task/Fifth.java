package task;

public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		char ch='A';
        for(int i=0;i<5;i++)
        {
        	for(int j=0;j<5;j++)
        	{
        		if(i%2==0&&(j==2||i==2))
        		{
        			System.out.print(n);
        			n++;
        		}
        			
        		else if(i%2!=0&&(j<=3&&j!=0))
        		{
        			System.out.print(ch);
        			ch++;
        		}
        		else
        			System.out.print(" ");
        			
        	}
        	System.out.println();
        }
	}

}
