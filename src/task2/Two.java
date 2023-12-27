package task2;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ELF BENCH 11 JAVA SELENIUM 2023";
        String b="0";
        int sum=0;
        char ch[] = a.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
        	if(ch[i]<='9'&&ch[i]>='0')
        		b+=ch[i];
        	else
        	{
        		sum+=Integer.parseInt(b);
        	    b="0";
        	}
        		
        	
        }
        sum+=Integer.parseInt(b);
        System.out.println(sum);
	}

}
