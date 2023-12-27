package colections;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> a=new LinkedList<String>();
        a.add("kaja");
        a.add("peko");
        a.add("kaja");
        ArrayList<String> b=new ArrayList<String>();
        b.add("kaya");
        b.add("ko");
        b.add("kaja");
        a.addAll(b);
        System.out.println(a.removeLast());
        a.addLast("pukesh");
        Iterator i=a.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
        
	}

}
