package pattern;

public class P80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		if(i+j<=6)
        		{
        			if(i%2==0)
        			  System.out.print("0");
        			else
        				System.out.print("1");
        		}
        	}
        	System.out.println();
        }
	}

}
//P81 change print statements 1 to 0 and 0 to 1
//P82 logic just change i into j in line 13