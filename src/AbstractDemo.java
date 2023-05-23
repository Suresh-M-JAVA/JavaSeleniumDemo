

abstract class Member{
	String name;
	abstract void welcome();
}

class Student extends Member{
	void welcome() {
		System.out.println("sssss");
	}
}
class Teacher extends Member{
	void welcome() {
		System.out.println("ttttttttttt");
	}
}

//data hiding, can't create object, like model
//can access by object of subclass which extends abstract class
//abstract methods must override by subclasses
abstract class Computer{
	void turnon() {
		System.out.println("turnig on");
	}
	
	abstract void turnoff();
}

class Dell extends Computer{

	@Override
	void turnoff() {
		System.out.println("turning off Dell");
		
	}
	
}

class HP extends Computer{

	@Override
	void turnoff() {
		System.out.println("turning off HP");
		
	}
	
}

public class AbstractDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.welcome();
		Teacher t1= new Teacher();
		t1.welcome();
		Member[] m = new Member[3];
		m[0] = new Teacher();
		m[1] = new Student();
		m[2] = new Teacher();
		for(Member m1:m)
			m1.welcome();
		
		//computer abstract class
		Dell dell = new Dell();
		dell.turnon();
		HP hp =new HP();
		hp.turnon();
		
		dell.turnoff();
		hp.turnoff();
	
	}
}
