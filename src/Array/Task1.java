package Array;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("enter size");
        int g=s.nextInt();
        int a[]=new int[g];
        for(int i=0;i<a.length;i++)
        {
        	System.out.println("enter value");
        	a[i]=s.nextInt();
        	
        }
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        	
        	
        }
	}

}
