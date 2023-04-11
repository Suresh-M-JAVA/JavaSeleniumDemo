import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// Only uniqwue values 
// No duplicates


public class SetDemo {

	public static void main(String[] args) {
		// Order not Maintained
		HashSet<String> hs = new HashSet<>();
		hs.add("aa");
		hs.add("dd");
		hs.add("ccc");
		hs.add("bb");
		hs.add("aa");
		System.out.println(hs);
		
		// Order Maintained
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("aa");
		lhs.add("cc");
		lhs.add("bb");
		lhs.add("aa");
		System.out.println(lhs);
		
		//Sorted
		TreeSet<String> ts = new TreeSet<>();
		ts.add("bb");
		ts.add("aa");
		ts.add("cc");
		ts.add("dd");
		System.out.println(ts);
	}

}
