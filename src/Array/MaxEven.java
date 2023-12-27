package Array;

public class MaxEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,5,8,1,3};
int max=a[0];
for(int i=0;i<a.length;i++)
{
	if(max<a[i]&&a[i]%2==0)
		max=a[i];
}
System.out.println(max);
	}

}
