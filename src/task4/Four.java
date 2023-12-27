package task4;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {1,2,3,4};
        int b[] = {5,6,7,8};
        
        
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
        	c[i]=a[i];
        }
        int k=a.length;
        for(int i=b.length-1;i>=0;i--)
        {
        	
        	c[k]=b[i];
        	k++;
        	
        }
        for(int i=0;i<c.length;i++)
        {
        	
        	System.out.print(c[i]+" ");
        }
        
	}

}
