package string;

public class RemovingDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="keeetthhaann";
        String noDup="";
        for(int i=0;i<a.length();i++)
        {
        	if(noDup.indexOf(a.charAt(i))==-1)
        		noDup=noDup+a.charAt(i);
        }
        System.out.println(noDup);
	}

}
