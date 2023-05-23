class Animal{
	public void sound() {
		System.out.println("animal make sound");
	}
}

class Cat extends Animal{
	public void sound() {
		System.out.println("cat sound");
	}
}

class Dog extends Animal{
	public void sound() {
		System.out.println("dog sound");
	}
}

public class RunTimePolymorphisam {
// Method overriding - same name with same parameters, return types
// when subclass overrides method of superclass
// appropriate method execution determined at runtime based on actual object type	
// animal1 instance referring cat object
// animal2 instance referring dog object	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.sound();
		animal2.sound();
	}

}
