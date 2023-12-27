package Array;

public class max2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,3,45,6,1,2};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
        	if(max<a[i])
        		max=a[i];
        }
        System.out.println(max);
        System.out.println("======");
        for(int i=0;i<a.length;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i]>a[j])
        		{
        			int temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        		}
        	}
        }
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+",");
        }
	}

}
