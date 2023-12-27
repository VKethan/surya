package task4;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student("charan",12,'A');
		obj.display();
	}

}
class Student
{
	String name;
	int age;
	char section;
	public Student(String name,int age,char section)
	{
		this.name=name;
		this.age=age;
		this.section=section;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(section);
	}
}
