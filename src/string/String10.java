package string;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class String10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        String a="AAgggdd";
        String b="";
		File file = new File("kethan.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter("kethan.txt");
		
        for(int i=0;i<a.length();i++)
        {
        	if(a.charAt(i)>=65&&a.charAt(i)<=90)
        		b+=(char)(a.charAt(i)+32);
        	else
        		b+=a.charAt(i);
        }
        System.out.println(b);
        writer.write(b);
        writer.close();
        File dest = new File("./abc.txt");
             
	}
}
