class A {
	void display() {
		System.out.println("aaaaaaa");
	}
}
class B extends A{
	void display() {
		System.out.println("bbbbbb");
	}
}
class C extends B{
	
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			C c=new C();
			c.display();
	}

}
