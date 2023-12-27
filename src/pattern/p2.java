package pattern;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			int x=i;
			for(int j=1;j<=5;j++)
			{
				if(j==1)
					System.out.print(i+" ");
				if(j==2)
					System.out.print(11-i+" ");
				else if(j==3)
					System.out.print(i+10+" ");
				else if(j==4)
					System.out.print(21-i+" ");
				else if(j==5)
					System.out.print(20+i+" ");
				
			}
			System.out.println();
		}
	}

}
