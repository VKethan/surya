package Array;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]={1,2,3,4,5};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
        	if(max<a[i])
        		max=a[i];
        }
        System.out.println(max);
        System.out.println("===========");
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a.length;j++)
        	{
        		if(a[i]<a[j])
        		{
        			int temp=a[i];
                	a[i]=a[j];
                	a[j]=temp;
        		}
        	}
        }
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(a.length);
	}

}
