
public class Customer {
	 int amount = 1000;
	 public synchronized void withdraw(int m) {
		 System.out.println("Bạn đang có : " +amount);
		 System.out.println("Bạn đang rút tiền : " +m);
		 if(amount<m) {
			 System.out.println("Bạn không đủ tiền rút!!! Vui Lòng Nạp Thêm ?");
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			amount=amount-m;
			System.out.println("Bạn rút tiền thành công : " +m);
	 }
	 synchronized void deposit(int m) {
		 System.out.println("Bạn đang gửi tiền : " +m);
		 amount=amount+m;
		 System.out.println("Bạn đang gửi tiền thành công :"+amount);
		 notify();
	 }
}
