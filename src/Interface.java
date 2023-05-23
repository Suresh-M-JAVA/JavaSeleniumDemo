//must not have body, all are abstract method
//override method must have public keyword
//class can implement multiple interface - multiple inheritance
//class can't extends multiple classes
interface Father{
	abstract void call();
	abstract void talk();
}

interface Mother{
	abstract void call();
	abstract void talk();
}


public class Interface implements Father, Mother{

	@Override
	public void call() {
		System.out.println("calling");
		
	}

	@Override
	public void talk() {
		System.out.println("talking");
		
	}

	public static void main(String[] args) {
		Interface ifobj = new Interface();
		ifobj.call();
		ifobj.talk();
	}
}
