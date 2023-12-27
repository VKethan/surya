package practice;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][]= {{1,2,3,1,1},{1,2,3,1,1},{1,2,3,1,1}};
        int sum=0;
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<5;j++)
        	{
        		if(i%2==0&&j%2==0)
        			sum=sum+a[i][j];
        	}
        }
        System.out.println(sum);
	}

}
