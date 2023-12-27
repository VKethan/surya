package practice;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {30,1,2,10};
        int temp;
        for(int i=0;i<a.length;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i]>a[j])
        		{
        			temp=a[i];
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
        System.out.println(a[2]);
	}

}
