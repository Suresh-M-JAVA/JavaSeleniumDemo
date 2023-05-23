class Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
}



public class CompileTimePolymorphisam {
 // Method Overloading - multiple methods with same name but diff parameters, return types
 //	many forms of method 
	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result1 = calc.add(5, 5);
		double result2 = calc.add(2.5, 2.5);
		
		System.out.println(result1);
		System.out.println(result2);

	}

}
