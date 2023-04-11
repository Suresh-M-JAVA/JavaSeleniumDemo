
interface Rideable{
	int Max_Speed = 100;
	void ride();   //SAM interface - Single abstract Method
	default void display() {
		System.out.println("from interface");
	}
}

class Car implements Rideable{
	public void ride() {
		System.out.println("ridinggg car");
	}
}
class Bike implements Rideable{
	public void ride() {
		System.out.println("ridinggg bike");
	}
}
class Mechanic{
	void check(Rideable r) {
		System.out.println("checkinggggg");
		r.ride();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mechanic m = new Mechanic();
		Car c=new Car();
		Bike b=new Bike();
		m.check(b);
		m.check(c);
		c.display();
	Rideable r2=new Rideable() {		//Anonymous class invoke by one obj r2 only
		public void ride(){
			System.out.println("anonymous checkinggggg");
		}
	};
	r2.ride();
	//lambda expression - SAM interface only
	Rideable r3 = () -> System.out.println("lambda expression");
	r3.ride();
	}

}
