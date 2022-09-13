package constructore_practice;

public class Emp {
	/*
	String ename;
	int eid;
	float esal;
	
	public Emp() {
		ename="Mukesh";
		eid= 143 ;
		esal= 1200000;
	}
	public void disp() {
		
		System.out.println("Emp name is:" +ename);
		System.out.println("Emp id is:" +eid);
		System.out.println("Emp salary is:" +esal);
	}
  public static void main(String[] args) {
	Emp e= new Emp();
	e.disp();
	
	Emp e1= new Emp();
	e1.disp();
	
	Emp e2= new Emp();
	e2.disp();
}
*/
	// By using parameterise constructore to avoiding the duplications of objects 
	String ename;
	int eid;
	float esal;
	
	
	public Emp(String ename, int eid, float esal) { 
		this.ename= ename;
		this.eid= eid;
		this.esal= esal;
	}
	public void disp() {
		System.out.println("Emp name is:"+ename);
		System.out.println("Emp id is:"+eid);
		System.out.println("Emp salary is:"+esal);
	}
	public static void main(String[] args) {
		Emp k= new Emp("Mukesh",143,1200000.26f);
		k.disp();
		Emp k1= new Emp("Rakesh",123,500000.26f);
		k1.disp();
		Emp k2= new Emp("Sujit",163,620000.26f);
		k2.disp();
	}
}
