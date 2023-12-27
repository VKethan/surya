package hasARelationship;

public class DriverForPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Phone p=new Phone();
        System.out.println(p);
        System.out.println(p.s);
        //after instantiation
        p.insertSim();
        System.out.println(p.s);
        p.s.number=12327;
        System.out.println(p.s.number);
	}

}
