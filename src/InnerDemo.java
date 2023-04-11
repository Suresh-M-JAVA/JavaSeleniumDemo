

class Outer{
	int num;
	void dis() {
		System.out.println("outerrrrrrr");
	}
	class Inner{
		int x;
		void display() {
			System.out.println("innerrrrrrrrrr");
		}
	}
}
public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o =new Outer();
		o.num = 10;
		o.dis();
		Outer.Inner i = o.new Inner();
		i.display();
	}

}
