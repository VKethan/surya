package hasARelationship;

public class NthPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=4;
         for(int i=1;i<n;i++)
         {
        	 if(n/i==i&&n%i==0)
        		 System.out.println("perfect square");
         }
	}

}
