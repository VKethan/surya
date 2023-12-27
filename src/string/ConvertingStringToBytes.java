package string;

public class ConvertingStringToBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="kethan";
        byte b[]=s.getBytes();
        for(int i=0;i<b.length;i++)
        {
        	System.out.println(b[i]);
        }
	}
}
