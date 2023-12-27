package hasARelationship;

public class Bank {
private String manager;
private String ifsc;
String branch;
Bank(String manager,String ifsc,String branch)
{
	this.manager=manager;
	this.ifsc=ifsc;
	this.branch=branch;
}
public String getManger()
{
	return manager;
}
public String getIfsc()
{
	return ifsc;
}
public void setManger(String manager)
{
	this.manager=manager;
}

public void setIfsc(String ifsc)
{
	this.ifsc=ifsc;
}
public void print()
{
	System.out.println(getManger());
	System.out.println(getIfsc());
}
}
class Account
{
	private String name;
	private double accno;
	private double balance;
	Account(String name,double accno,double balance)
	{
		this.name=name;
		this.accno=accno;
		this.balance=balance;
	}
	public String getName(){return name;}
	public double getAccno() {return accno;}
	public double getBalance() {return balance;}
	public void setBalance(double balance) {this.balance=balance;}
	public void print()
	{
		System.out.println(getName());
		System.out.println(getAccno());
		System.out.println(getBalance());
	}
}
