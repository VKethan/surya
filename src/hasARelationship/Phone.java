package hasARelationship;

public class Phone {
 Sim s;
 public void insertSim()
 {
	 this.s=new Sim();
 }
}
class Sim
{
	long number;
}