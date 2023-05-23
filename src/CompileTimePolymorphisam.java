class Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
}

class FindMin{
	void min(int a, int b) {
		if(a<b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
	
	void min(int a, int b, int c) {
		if(a<b && a<c) {
			System.out.println(a);
		} else if (b<c) {
			System.out.println(b);
		} else {
		 System.out.println(c);
		}
	}
}

public class CompileTimePolymorphisam {
 // Method Overloading - multiple methods with same name but diff parameters, return types
 //	many forms of method
	// compile time - code converted to machine code
	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result1 = calc.add(5, 5);
		double result2 = calc.add(2.5, 2.5);
		
		System.out.println(result1);
		System.out.println(result2);
		
		FindMin findmin = new FindMin();
		findmin.min(5, 6);
		findmin.min(8, 3, 7);

	}

}
