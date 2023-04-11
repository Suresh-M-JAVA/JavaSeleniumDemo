import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		int c=0;
		
	try {
		c=a/b;
		int arr[]= null;
		System.out.println(arr[1]);
		}
	catch(ArithmeticException | NullPointerException  e) {
			// e.printStackTrace();
			System.out.println("arithmetic exc");
		}
	catch(Exception e) {
		// e.printStackTrace();
		System.out.println("exc");
	}
	finally {
		System.out.println("Executed finally block whether error occured or not ");
	}
	
	File file=new File("abc.txt");
	try {
		FileInputStream fs= new FileInputStream(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		// e.printStackTrace();
		System.out.println("file errrrr");
	}
	
		System.out.println(c);
		System.out.println("endddd");
	
//	int i=0;
//	try(Scanner sc=new Scanner(System.in)){
//		i = sc.nextInt();
//	}
//	System.out.println(i);
		
		double bal=500, withdraw=700;
		try {
		if(bal<withdraw)
			throw new InsufficientfundException(withdraw-bal);
		}catch(InsufficientfundException e) {
			System.out.println("No fund");
		}
	}
}
