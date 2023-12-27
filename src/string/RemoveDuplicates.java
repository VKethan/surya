package string;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Seleniume";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='&';
				}
			}
			if(count==1 && ch[i]!='&')
			{
				System.out.print(ch[i]);
			}
;		}
	}

}
