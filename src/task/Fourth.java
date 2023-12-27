package task;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String sentence = "Happy Deepavali Festival to all of you";
        //sentence=sentence.toUpperCase();
        //System.out.println(sentence);
        for(char i='a';i<='z';i++)
        {
        	int count=0;
        	for(int j=0;j<sentence.length();j++)
        	{
        		if(i==sentence.charAt(j))
        		{
        			count++;
        		}			
        		
        	}
        	if(count>1)
        		System.out.println(i);	
        }
	}

}
