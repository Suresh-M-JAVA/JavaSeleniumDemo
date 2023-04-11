
class Dept implements Cloneable{
	int deptid;
	String name;
	
	Dept(int id, String n){
	deptid = id;
	name = n;
	}
	void dis() {
		System.out.println(deptid + " " + name);
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Stu implements Cloneable{
	int id;
	String name;
	Dept dept;
	
	Stu(int sid, String n, Dept d){
		id = sid;
		name = n;
		dept = d;
		}
	Stu(Stu s){
		this.id = s.id;
		this.name = s.name;
		this.dept = s.dept;
		}
	
	protected Object clone() throws CloneNotSupportedException {
		Stu s = (Stu)super.clone();
		s.dept = (Dept)s.dept.clone();
		return s;
	}
	void dis() {
		System.out.println(id + " " + name);
		dept.dis();
	}
	
}

public class ObjectcloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Dept d = new Dept(1, "ece");
		Stu s1 = new Stu(1,"aaa",d);
		Stu s2= (Stu) s1.clone();
		// System.out.println(s2.id + " " + s2.name + " " + s2.dept.deptid + " " + s2.dept.name);
		// d.name = "mech";
		s1.dis();
		s2.dis();
		Stu s3=new Stu(s1);
		s3.dis();
	}
}
