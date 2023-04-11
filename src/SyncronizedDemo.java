
class Table{
		synchronized void PrintTable(int n){
		for (int i=1;i<=5;i++) {
			System.out.println(i*n);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class SyncronizedDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Table t=new Table();
		
		Thread t1=new Thread() {
			public void run() {
				t.PrintTable(5);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				t.PrintTable(2);
			}
		};
		t1.start();
		t2.start();
	}
}
