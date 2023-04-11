import java.lang.reflect.*;

public class ReflectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp("zzzzz", 1000.0);
		Class cls = e.getClass();
		System.out.println(cls.getName());
	Method[] methods = cls.getMethods();
	for (Method m:methods)
		System.out.println(m.getName());
	
	
	}
}
