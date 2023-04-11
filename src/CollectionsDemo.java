import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		// ArrayList
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i=0;i<=10;i++)
			al.add(i);
		
		System.out.println(al);
		al.add(10);
		System.out.println(al.contains(10));
		System.out.println(al.add(20));
		System.out.println(al);
		
		for(int i:al)
			System.out.println(i);
		
		Iterator<Integer> i = al.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
			}
		
		// LinkedList
		LinkedList<Integer> ll= new LinkedList<>();
		for(int j=0;j<=10;j++)
			ll.add(j);
		
			System.out.println(ll);
			System.out.println(ll.indexOf(1));
			System.out.println(ll.isEmpty());
			
	}

}
