package Array;

import java.util.ArrayList;
import java.util.Iterator;

public class ConscecutiveOnesMaxCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,1,1,0,0,0,0,1,1,0,0,0,1,1,1,1,1,1,0,0};
        //int count=0;
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]==1)
        	{
        		int count=1;
        		for(int j=i+1;j<a.length;j++)
        		{
        			if(a[i]==a[j])
        				count++;
        			else
        				break;
        		}
        		if(count>1)
        		 l.add(count);
        	}
        }
        //Iterator itr = l.iterator();
        int max = 0;
        for(Object o:l)
        {
        	//System.out.println(o);
        	if(max<(int)o)
        		max=(int)o;
        		
        }
        System.out.println(max);
	}

}
