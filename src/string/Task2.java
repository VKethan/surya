package string;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="WWWPreethe";
		char b[]=a.toCharArray();
		String s="";
		for(int i=0;i<b.length;i++)
		{
			int count=0;
			if(s.indexOf(b[i])==-1) {
				for(int j=0;j<b.length;j++)
				{
					if(b[i]==b[j])
					{
						count++;
					}
				}
				s+=""+b[i]+count;
			}
			
			
		}
		System.out.print(s);
	}

}
