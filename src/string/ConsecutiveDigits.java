package string;

public class ConsecutiveDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String n="elf44andelf45javaselenium2023";
        int count=0;
        int sum=0;
        for(int i=0;i<n.length()-1;i++)
        {
        	if((n.charAt(i)<='9'||n.charAt(i)>='0')&&(n.charAt(i+1)<='9'||n.charAt(i+1)>='0'))
        		count++;
        }
        String a[]=new String[count];
        for(int i=0;i<n.length()-1;i++)
        {
        	if((n.charAt(i)<='9'||n.charAt(i)>='0')&&(n.charAt(i+1)<='9'||n.charAt(i+1)>='0'))
        		a[i]=""+n.charAt(i)+n.charAt(i+1);
        }
        for(int i=0;i<a.length;i++)
        {
        	sum=sum+Integer.parseInt(a[i]);
        }
        System.out.println(sum);
	}

}
