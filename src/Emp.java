import java.util.*;

public class Emp implements Comparable<Emp>{
		private String name;
		private double sal;
		
		Emp(String n, double s){
			name = n;
			sal = s;
		}
		Emp(){
			name = " ";
			sal = 0.0;
		}
		String getName(){
			return name;
		}
		void setName(String n) {
			name = n;
		}
		double getSal() {
			return sal;
		}
		void setSal(double s) {
			sal = s;
		}
		
		void raisesal(double percent) {
			sal += sal*percent/100;
		}
		
		public boolean equals(Object obj) {
			if(this==obj)
				return true;
			if(obj==null)
				return false;
			if(this.getClass()!= obj.getClass())
				return false;
			
			Emp e = (Emp)obj;
			return this.name.equals(e.name) && this.sal==e.sal;
		}
		public int compareTo(Emp e) {
			if(this.sal==e.sal)
				return 0;
			if(this.sal<e.sal)
				return -1;
			return 1;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp("ram", 10000);
		Emp e2 = new Emp("ram", 10000);
		System.out.println(e1.equals(e2));
		e1.raisesal(10);
		Manager m1 = new Manager("ssss", 10000.0, 100.0);
		System.out.println(e1.getSal());
		System.out.println(m1.getSal() + m1.getName() + m1.bonus);
		m1.setBonus(1000);
		System.out.println(m1.getSal());
		Emp[] employees=new Emp[4];
		employees[0]= new Emp("aaa", 80000);
		employees[1]= new Emp("bbb", 20000);
		employees[2]= new Emp("ccc", 10000);
		employees[3]= new Emp("ddd", 40000);
		Manager m2;
//		for(Emp e:employees)
//			System.out.println(e.getName()+" "+ e.getSal());
		Arrays.sort(employees);
		for(Emp e:employees)
			System.out.println(e.getName()+" "+ e.getSal());
		
	}
}
class Manager extends Emp{
	double bonus;
	Manager(String n, double s, double b) {
		super(n,s);
		bonus = b;
		// TODO Auto-generated constructor stub
	}
	
	public void setBonus(double b){
		bonus = b;
	}
	public double getSal() {
		return super.getSal()+bonus;
	}
	
}