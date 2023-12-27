package task;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {28,45,36,102,87,66,55,99,12};
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a.length;j++)
        	{
        		if(a[i]<a[j])
            	{
            		int temp = a[i];
            		a[i]=a[j];
            		a[j]=temp;
            	}
        	}
        	
        }
        int sum = a[1]+a[a.length-2];
        System.out.println(sum);
	}

}
