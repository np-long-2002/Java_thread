import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RunThread extends Thread{
	ArrayList<BankAccount> list;
	private boolean flag = true;
	public RunThread(ArrayList<BankAccount> list) {
		this.list = list;
	}
	public void stopThread() {
		this.flag=false;
		System.out.println("Send stopped");
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(flag) {
			int from = ThreadLocalRandom.current().nextInt(0,list.size());
			int to= from;
			while(from==to) {
				to=ThreadLocalRandom.current().nextInt(0,list.size());
			}
			Thread th = new TransferThread(list.get(from),list.get(to), ThreadLocalRandom.current().nextLong(100000));
			th.start();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
