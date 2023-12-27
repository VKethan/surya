package practice;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> a=new ArrayList<Integer>();
     a.add(1);
     a.add(2);
     a.add(3);
     a.add(4);
     a.add(5);
     int sum=0;
     for(Object o:a)
     {
    	 sum=sum+(int)o;
     }
     System.out.println(sum);
	}
}
