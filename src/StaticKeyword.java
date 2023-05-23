
class Fatherr{
	static char gender = 'M';
	static int age = 50;
	static void print() {
		System.out.println("parent class");
	}
}

class Daughter extends Fatherr{
	final char gender = 'F';
}

public class StaticKeyword {

	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.print();
		System.out.println(d.gender);
		System.out.println(Fatherr.gender);
		System.out.println(Fatherr.age);
		Daughter.age = 18;
		System.out.println(Fatherr.age);
		//can access without object
		Fatherr.print();
	}
}
