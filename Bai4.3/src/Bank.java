
public class Bank {
	public static void main(String[] args) {
		Customer kh = new Customer();
		Thread t1 = new Thread() {
			public void run() {
				kh.withdraw(2000);
			};
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				kh.deposit(1600);
			};
		};
		t2.start();
	}
}
