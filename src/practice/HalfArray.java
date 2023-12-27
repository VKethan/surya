package practice;

public class HalfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,2,3,4,1,1};
        int b[]=new int[(a.length/2)+1];
        int sum=0;
        for(int i=a.length/2;i<a.length;i++)
        {
        	sum=sum+a[i];
        }
        for(int i=0;i<a.length/2;i++)
        {
        	b[i]=a[i];
        }
        b[b.length-1]=sum;
        for(int i=0;i<b.length;i++)
        {
        	System.out.print(b[i]+" ");
        }
	}

}
