package task2;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,98,45,23,74,56,87};
        for(int i=0;i<a.length;i++)
        {
        	
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i]%10>a[j]%10)
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
