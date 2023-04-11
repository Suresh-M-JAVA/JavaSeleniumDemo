
//class Book implements Runnable{
//	public void run() {
//		for (int i=0;i<=5;i++) {
//			System.out.println("updatinggggg");
//			try {Thread.sleep(5000); } catch (InterruptedException e) {}
//		}
//	}
//}
class Num extends Thread{
	public void run() {
		for (int i=0;i<=5;i++) {
			System.out.println(i);
			try {Thread.sleep(3000); } catch (InterruptedException e) {}
		}
		}
}

public class MultiThreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable b=() ->
		{
						for (int i=0;i<=5;i++) {
						System.out.println("updatinggggg");
						try {Thread.sleep(5000); } catch (InterruptedException e) {}
						}
		};
		Num n=new Num();
		// b.updateDB();
		// b.start();
		// n.print();
		Thread t1=new Thread(b);
		t1.start();
		t1.setName("book");
		t1.setPriority(2);
		System.out.println(t1.getPriority());
		System.out.println(t1.isAlive());
		
		t1.join();
		n.join();
		
		System.out.println("enddddddd... waiting to complete above 2 threads");
	}

}
