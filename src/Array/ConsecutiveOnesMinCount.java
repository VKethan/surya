package Array;

import java.util.ArrayList;

public class ConsecutiveOnesMinCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,1,0,0,0,0,1,1,0,0,0,1,1,1,1,1,1,0,0};
        
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
        
        int min = (int)l.get(0);
        for(Object o:l)
        {
        	
        	if(min>(int)o)
        		min=(int)o;
        		
        }
        System.out.println(min);
	}

}
