package practice;

import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,29,2,4,5,1};
        int b[]=new int[a.length/2+1];
        int c[]=new int[a.length/2];
        int k=0;
        int j=0;
        for(int i=0;i<a.length;i++)
        {
        	if(i%2==0)
        	{
        		b[k]=a[i];
        		k++;
        	}
        	else
        	{
        		c[j]=a[i];
        		j++;
        	}	
        }
        Arrays.sort(b);
        Arrays.sort(c);
        System.out.println(b[b.length-2]);
        System.out.println(c[1]);
        System.out.println(b[b.length-2]+c[1]);
	}

}
