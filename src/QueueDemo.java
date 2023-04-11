import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
		
		//Sorting before Added
//		PriorityQueue<Integer> pq = new LinkedList<>();
//		pq.add(10);
//		pq.add(1);
//		pq.add(5);
		
		
	}

}
