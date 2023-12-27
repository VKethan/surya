package practice;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {1,2,3,4};
    int sum=0;
    for(int i=0;i<a.length;i++)
    {
    	for(int j=i+1;j<a.length;j++)
    	{
    		sum=sum+a[i]+a[j];
    	}
    }
    System.out.println(sum);
	}
}
