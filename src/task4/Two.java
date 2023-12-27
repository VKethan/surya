package task4;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Encapsulation obj = new Encapsulation(); 
        
        obj.updateStudentDetails(10,"kethan","10th",'A',90);
        obj.studentDetails(10);
        obj.read();
        obj.write();
        obj.play();
	}

}
class Encapsulation
{
	private int id=10;
	private String name;
	private String standard;
	private char section;
	private int percentage;
	
	public void updateStudentDetails(int id,String name,String standard,char section,int percentage)
	{
		if(this.id==id)
		{
			this.name=name;
			this.standard=standard;
			this.section=section;
			this.percentage=percentage;
			
		}
	}
	public void studentDetails(int id)
	{
		if(this.id==id)
		{
			System.out.println(name);
			System.out.println(standard);
			System.out.println(section);
			System.out.println(percentage);
			
		}
	}
	public void read()
	{
		System.out.println(name+" is reading");
	}
	public void write()
	{
		System.out.println(name+" is writing");
	}
	public void play()
	{
		System.out.println(name+" is playing");
	}
}