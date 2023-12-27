package Array;

public class SortTensDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {125,985,452,231,743,565,874};
        for(int i=0;i<a.length;i++)
        {
        	
        	for(int j=i+1;j<a.length;j++)
        	{
        		int x=a[i]/10;
        		int y=a[j]/10;
        		
        		if(x%10>y%10)
        		{
        			int temp = a[i];
        			a[i]=a[j];
        			a[j]=temp;
        		}
        	}
        }
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
	}
}
