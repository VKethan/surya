package task3;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		if(i==j||i+j==6)
        			System.out.print("x");
        		else
        			System.out.print(" ");
        	}
        	System.out.println();
        }
	}

}
