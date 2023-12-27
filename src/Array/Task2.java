package Array;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("enter no of rows");
int a=s.nextInt();
System.out.println("enter no of columns");
int b=s.nextInt();
int c[][]=new int[a][b];
for(int i=0;i<a;i++)
{
	for(int j=0;j<b;j++)
	{
		System.out.println("enter value");
		c[i][j]=s.nextInt();
		
	}
}
for(int i=0;i<a;i++)
{
	for(int j=0;j<b;j++)
	{
		System.out.print(c[i][j]+" ");
	}
	System.out.println();
}
	}

}
