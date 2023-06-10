
public class MyThread1 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName() + " : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {	
		MyThread1 myThread1 = new MyThread1();
		Thread thread1 = new Thread(myThread1);
		Thread thread2 = new Thread(myThread1);
		thread1.setPriority(10);
		thread2.setPriority(1);
		thread1.setName("thread1");
		thread2.setName("thread2");
		thread1.start();
		thread2.start();
	}
	
}
