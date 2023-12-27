package practice;

public class FB {
private String mail;
private String password;

public void setMail(String mail)
{
	this.mail=mail;
}
public String getMail()
{
	return mail;
}
public void setPassword(String password)
{
	this.password=password;
}
public String getPassword()
{
	return password;
}
FB()
{
	
}
FB(String mail,String password)
{
	this.mail=mail;
	this.password=password;
}
public void printA()
{
	System.out.println(getMail());
	System.out.println(getPassword());
}
}
class FB1 extends FB
{
	
	
	String status;
	FB1(String mail,String password,String status)
	{
	   super(mail,password);
	   this.status=status;
	}
	FB1(String status)
	{
		this.status=status;
	}
	public void printB()
	{
		System.out.println(getMail());
		System.out.println(getPassword());
		System.out.println(status);
	}
	public static void main(String[] args)
	{
		FB obj = new FB("kethan@gmail.com","123@#");
		obj.printA();
		FB1 obj2=new FB1("passed");
		obj2.printB();
		FB1 obj3=new FB1("kethan@gmail.com","123@#","passed");
		obj3.printB();
		
		
	}
}
