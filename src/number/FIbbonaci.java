package number;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIbbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n1=0;
        int n2=1;
        int n3=0;
        String s="";
        s+=n1+","+n2;
        File file=new File("./abc.txt");
        
        for(int i=2;i<10;i++)
        {
        	n3=n1+n2;
        	n1=n2;
        	n2=n3;
        	s+=","+n3;
        	
        }
        try {
			FileWriter writer=new FileWriter(file);
			writer.write(s);
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
