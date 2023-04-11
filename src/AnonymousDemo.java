

class Cycle {
	void dis() {
		System.out.println("cycleeeeee");
	}
}
public class AnonymousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle c=new Cycle() {
			void dis() {
				System.out.println("bicycleeeee");
			}
		};
		c.dis();
		Cycle c1=new Cycle();
		c1.dis();
	}

}
