
public class MyThread2{
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		try {
			thread1.start();
			thread1.join();
			thread2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
