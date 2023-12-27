package Array;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {2,3,4,2,2,1,4,3};
        int count=0;
        int b=2;
        for(int i=0;i<a.length;i++)
        {
        	if(b==a[i])
        		count++;
        }
        System.out.println(count);
	}
}
