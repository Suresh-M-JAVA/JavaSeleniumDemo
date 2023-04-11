

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
	}
}
