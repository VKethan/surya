package task2;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(fact((5)));
	}
    public static int fact(int n)
    {
    	if(n==0||n==1)
    		return 1;
    	else
    		return n*fact(n-1);
    }

}
