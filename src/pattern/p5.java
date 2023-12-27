package pattern;

public class p5 {
public static void main(String[] args) {
	char x='A';
	for(int i=1;i<=5;i++)
	{char c=x;
		
		for(int j=1;j<=5;j++)
		{
			System.out.print(c++);
		}
		x++;
		System.out.println();
	}
}
}
