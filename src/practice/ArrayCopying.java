package practice;

public class ArrayCopying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,2,3};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
        	b[i]=a[i];
        }
        for(int i=0;i<b.length;i++)
        {
        	System.out.print(b[i]+" ");
        }
        System.out.println();
        for(int i=b.length-1;i>=0;i--)
        {
        	System.out.print(b[i]+" ");
        }
        
	}

}
