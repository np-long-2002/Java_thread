
public class Thread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=10; i++) {
           if(i%2==0) {
        	   System.out.println("Thread 1 : "+i);
        	   try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           }
        }
	}

}
